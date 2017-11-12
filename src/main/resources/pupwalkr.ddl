DROP TABLE IF EXISTS walkrsZip;
DROP TABLE IF EXISTS walkrs;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
  userId INTEGER PRIMARY KEY,
  email VARCHAR(256) NOT NULL,
  salt VARCHAR(256) NOT NULL,
  passHash VARCHAR(256) NOT NULL,
  worldpayid VARCHAR(100),
  cell BIGINT NOT NULL,
  firstName VARCHAR(100) NOT NULL,
  lastName VARCHAR(100) NOT NULL
);

CREATE TABLE walkrs (
  walkrId INTEGER PRIMARY KEY,

  FOREIGN KEY (walkrId) REFERENCES users(userId)
);

CREATE TABLE walkrsZip (
  walkrId INTEGER,
  zipcode INTEGER,

  FOREIGN KEY (walkrId) REFERENCES walkrs(walkrId)
);

INSERT INTO users(userId, email, salt, passHash, cell, firstName, lastName)
  VALUES (1, 'nathan.melanson@gmail.com', 'abc123', md5('abc123pupwalkr'), '4047346233', 'Nathan', 'Melanson');

INSERT INTO walkrs(walkrId) VALUES (1);

INSERT INTO walkrsZip(walkrId, zipcode) VALUES (1, 30326), (1, 30030)