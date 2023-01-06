CREATE TABLE POST(
    id SERIAL PRIMARY KEY,
    post varchar(255),
   user_fk int  REFERENCES post(id)
);ALTER TABLE user ADD user_fk INT REFERENCES user(id);