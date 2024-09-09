package br.com.fiap.apisphere.user;

import br.com.fiap.apisphere.user.dto.UserProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user, UriComponentsBuilder uriBuilder){
        service.create(user);

        var uri = uriBuilder
                    .path("/users/{id}")
                    .buildAndExpand(user.getId())
                    .toUri();

        return ResponseEntity
                    .created(uri)
                    .body(user);
    }

    @GetMapping("profile")
    public UserProfileResponse getUserProfile(){
        var email = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        return service.getUserProfile(email);
    }

    @PostMapping("avatar")
    public void uploadAvatar(@RequestBody MultipartFile file){
        var email = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        service.uploadAvatar(email, file);
    }

    // /users/avatar/avatar.jpg
    @GetMapping("avatar/{filename}")
    public ResponseEntity<Resource> getAvatar(@PathVariable String filename){
        return service.getAvatar(filename);
    }

}
