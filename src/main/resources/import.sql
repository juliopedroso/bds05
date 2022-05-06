INSERT INTO tb_user (name,  email, password) VALUES ('Bob Brown', 'bob@gmail.com',   '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name,  email, password) VALUES ('Ana Green', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name,  email, password) VALUES ('Alex Brown', 'alex@gmail.com',   '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_genre (name) VALUES ('suspense');
INSERT INTO tb_genre (name) VALUES ('ação');
INSERT INTO tb_genre (name) VALUES ('desenho');

INSERT INTO tb_movie (title, sub_title, year, img_url,synopsis,genre_id) VALUES ('007', 'Moscou contra 007',1963,'http://server/img1.jpg','sinopse filme 1',2);
INSERT INTO tb_movie (title, sub_title, year, img_url,synopsis,genre_id) VALUES ('008', 'Moscou contra 008',1964,'http://server/img2.jpg','sinopse filme 2',3);
INSERT INTO tb_movie (title, sub_title, year, img_url,synopsis,genre_id) VALUES ('009', 'Moscou contra 009',1965,'http://server/img3.jpg','sinopse filme 3',1);

INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Filme muito bom', 1, 1);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Filme bem divertido', 2, 2);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Filme muito trist', 3, 1);
