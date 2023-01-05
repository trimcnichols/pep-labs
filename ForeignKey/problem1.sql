CREATE TABLE POST(
    id SERIAL PRIMARY KEY,
    post varchar(255),
   user_fk int NOT NULL FOREIGN KEY  REFERENCES user(id)
);