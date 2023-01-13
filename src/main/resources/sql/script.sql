CREATE DATABASE music_pulse_db;

USE music_pulse_db;

CREATE TABLE country
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO country(name)
VALUES ('Chile');

CREATE TABLE genre
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO genre(name)
VALUES ('Metal');
INSERT INTO genre(name)
VALUES ('Progressive Metal');

CREATE TABLE artist
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    image_url  VARCHAR(255) NOT NULL,
    country_id INT          NOT NULL,
    FOREIGN KEY (country_id) REFERENCES country (id)
);

INSERT INTO artist
VALUES (NULL, 'Koke Benavides', 'https://f4.bcbits.com/img/0014021986_10.jpg', 1);

CREATE TABLE artist_contact_info
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    email     VARCHAR(255) NOT NULL,
    artist_id INT          NOT NULL,
    FOREIGN KEY (artist_id) REFERENCES artist (id)
);

CREATE TABLE artist_genre
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    artist_id INT NOT NULL,
    genre_id  INT NOT NULL,
    FOREIGN KEY (artist_id) REFERENCES artist (id),
    FOREIGN KEY (genre_id) REFERENCES genre (id)
);

INSERT INTO artist_genre
VALUES (NULL, 1, 1);
INSERT INTO artist_genre
VALUES (NULL, 1, 2);

CREATE TABLE disc
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(100) NOT NULL,
    year      INT          NOT NULL,
    artist_id INT          NOT NULL,
    FOREIGN KEY (artist_id) REFERENCES artist (id)
);

INSERT INTO disc
VALUES (NULL, 'Overload', 2015, 1);
INSERT INTO disc
VALUES (NULL, 'Perspectiva', 2020, 1);

CREATE TABLE dvd
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(255) NOT NULL,
    year      INT          NOT NULL,
    artist_id INT          NOT NULL,
    FOREIGN KEY (artist_id) REFERENCES artist (id)
);

CREATE TABLE social_media
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    name     VARCHAR(255) NOT NULL,
    icon_url VARCHAR(255) NOT NULL
);

INSERT INTO social_media
VALUES (NULL, 'Youtube', 'https://cdn-icons-png.flaticon.com/512/1384/1384060.png');
INSERT INTO social_media
VALUES (NULL, 'Facebook',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/2021_Facebook_icon.svg/2048px-2021_Facebook_icon.svg.png');
INSERT INTO social_media
VALUES (NULL, 'Twitter',
        'https://cdn4.iconfinder.com/data/icons/social-media-icons-the-circle-set/48/twitter_circle-512.png');
INSERT INTO social_media
VALUES (NULL, 'Instagram',
        'https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2022/06/033fd-logo-instagram-icon.png?fit=512%2C512&ssl=1');
INSERT INTO social_media
VALUES (NULL, 'Spotify',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Spotify_icon.svg/991px-Spotify_icon.svg.png');
INSERT INTO social_media
VALUES (NULL, 'Youtube Music',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Youtube_Music_icon.svg/2048px-Youtube_Music_icon.svg.png');
INSERT INTO social_media
VALUES (NULL, 'Wikipedia',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Tango_style_Wikipedia_Icon.svg/1200px-Tango_style_Wikipedia_Icon.svg.png');

CREATE TABLE disc_streaming
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    disc_id         INT          NOT NULL,
    social_media_id INT          NOT NULL,
    url             VARCHAR(255) NOT NULL,
    FOREIGN KEY (disc_id) REFERENCES disc (id),
    FOREIGN KEY (social_media_id) REFERENCES social_media (id)
);

INSERT INTO disc_streaming
VALUES (NULL, 1, 5, 'https://open.spotify.com/album/2fYLQJ09NdzWmppch8hV3I');
INSERT INTO disc_streaming
VALUES (NULL, 1, 6, 'https://music.youtube.com/playlist?list=OLAK5uy_ne7jfTCwmzgKZvxbGJoXRbVdbYAmdxO1s');
INSERT INTO disc_streaming
VALUES (NULL, 2, 5, 'https://open.spotify.com/album/08uRGv3VvTb85aegVbW2Cd');
INSERT INTO disc_streaming
VALUES (NULL, 2, 6, 'https://music.youtube.com/playlist?list=OLAK5uy_l8O8X0OVJ5FruUzF2WwCy2d60trYW5mZM');

CREATE TABLE artist_social_media
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    name_id         VARCHAR(255) NOT NULL,
    artist_id       INT          NOT NULL,
    social_media_id INT          NOT NULL,
    url             VARCHAR(255) NOT NULL,
    FOREIGN KEY (artist_id) REFERENCES artist (id),
    FOREIGN KEY (social_media_id) REFERENCES social_media (id)
);

INSERT INTO artist_social_media
VALUES (NULL, '@kokebenavidesmusic', 1, 1, 'https://www.youtube.com/channel/UCH7LS5Pw2Pat56yR70_X1ow');
INSERT INTO artist_social_media
VALUES (NULL, '@kokebenavides2', 1, 2, 'https://www.facebook.com/kokebenavides2/');
INSERT INTO artist_social_media
VALUES (NULL, '@kokebenavides', 1, 3, 'https://twitter.com/kokebenavides');
INSERT INTO artist_social_media
VALUES (NULL, '@kokebenavides', 1, 4, 'https://www.instagram.com/kokebenavides');
INSERT INTO artist_social_media
VALUES (NULL, '@kokebenavides', 1, 5, 'https://open.spotify.com/artist/7vNDqKCgE6DGmVox1HP8Sg');
INSERT INTO artist_social_media
VALUES (NULL, '@kokebenavides', 1, 6, 'https://music.youtube.com/channel/UCc7ev9cYYqldtmel5u9NRaA');

CREATE TABLE video
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    url       VARCHAR(255) NOT NULL,
    artist_id INT          NOT NULL,
    FOREIGN KEY (artist_id) REFERENCES artist (id)
);

INSERT INTO video
VALUES (NULL, 'https://www.youtube.com/watch?v=kDGDznuu1ng', 1);
INSERT INTO video
VALUES (NULL, 'https://www.youtube.com/watch?v=n5QOerCHc-M', 1);

CREATE TABLE tag
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO tag(name) VALUES('musicvideo');

CREATE TABLE video_tag
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    video_id INT NOT NULL,
    tag_id   INT NOT NULL,
    FOREIGN KEY (video_id) REFERENCES video (id),
    FOREIGN KEY (tag_id) REFERENCES tag (id)
);

INSERT INTO video_tag VALUES(NULL, 1, 1);
INSERT INTO video_tag VALUES(NULL, 2, 1);

SELECT * FROM country;
SELECT * FROM genre;
SELECT * FROM artist;
SELECT * FROM artist_contact_info;
SELECT * FROM artist_genre;
SELECT * FROM disc;
SELECT * FROM dvd;
SELECT * FROM social_media;
SELECT * FROM disc_streaming;
SELECT * FROM artist_social_media;
SELECT * FROM video;
SELECT * FROM tag;
SELECT * FROM video_tag;
