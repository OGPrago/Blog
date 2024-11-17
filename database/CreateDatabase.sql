# ---------------------------------------------------------------------- #
# Target DBMS:           MySQL                                           #
# Project name:          blogdb                               			 #
# ---------------------------------------------------------------------- #

DROP DATABASE IF EXISTS blogdb;

CREATE DATABASE IF NOT EXISTS blogdb;

USE blogdb;

# ---------------------------------------------------------------------- #
# Tables                                                                 #
# ---------------------------------------------------------------------- #

CREATE TABLE post (
    postId INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    content VARCHAR(140) NOT NULL,
    PRIMARY KEY (postId)
);
