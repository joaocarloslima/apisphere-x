ALTER TABLE users
ADD COLUMN avatar varchar(255);

UPDATE users SET avatar = 'https://avatar.iran.liara.run/username?username=Alice+Smith' WHERE id=1;
UPDATE users SET avatar = 'https://avatar.iran.liara.run/username?username=Bob+Johnson' WHERE id=2;
UPDATE users SET avatar = 'https://avatar.iran.liara.run/username?username=Charlie+Brown' WHERE id=3;