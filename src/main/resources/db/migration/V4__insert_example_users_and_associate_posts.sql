INSERT INTO users (name, bio, email, password, created_at, updated_at) VALUES
('Alice', 'Software Developer', 'alice@example.com', '$2a$12$xqWmySK1KWn480WGt2eojODAZzFXCRb8/mHX7K9ncHWCjXKcuVuvW', '2024-08-25 09:00:00', '2024-08-25 09:00:00'),
('Bob', 'Data Scientist', 'bob@example.com', '$2a$12$xqWmySK1KWn480WGt2eojODAZzFXCRb8/mHX7K9ncHWCjXKcuVuvW', '2024-08-25 09:30:00', '2024-08-25 09:30:00'),
('Charlie', 'DevOps Engineer', 'charlie@example.com', '$2a$12$xqWmySK1KWn480WGt2eojODAZzFXCRb8/mHX7K9ncHWCjXKcuVuvW', '2024-08-25 10:00:00', '2024-08-25 10:00:00');


UPDATE posts SET user_id = 1 WHERE id = 1;
UPDATE posts SET user_id = 2 WHERE id = 2;
UPDATE posts SET user_id = 3 WHERE id = 3;
UPDATE posts SET user_id = 1 WHERE id = 4;
UPDATE posts SET user_id = 2 WHERE id = 5;