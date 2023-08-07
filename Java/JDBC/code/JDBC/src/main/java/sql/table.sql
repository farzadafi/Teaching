CREATE TABLE IF NOT EXISTS users
(
    id        SERIAL PRIMARY KEY,
    firstname VARCHAR(50) NOT NULL,
    lastname  VARCHAR(50) NOT NULL,
    username  VARCHAR(50) UNIQUE,
    password  VARCHAR(50) NOT NULL
    );