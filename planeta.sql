
USE ETech;

CREATE TABLE Planeta(
    id INT NOT NULL AUTO_INCREMENT,
    nomePlaneta CHAR(100) UNIQUE,
    tipo CHAR(100),
    x DOUBLE,
    y DOUBLE,
    z DOUBLE,
    PRIMARY KEY(id)
    );

