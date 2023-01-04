CREATE TABLE POST(
    id SERIAL PRIMARY KEY,
    post varchar(255),
   user_fk int REFERENCES user(id)
);