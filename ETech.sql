DROP DATABASE IF EXISTS ETech;
CREATE DATABASE ETech;
USE ETech;

CREATE TABLE Planeta(
	idPlaneta INT NOT NULL AUTO_INCREMENT,
	nomePlaneta VARCHAR(100) UNIQUE NOT NULL,
  tipo VARCHAR(100) NOT NULL,
  x DECIMAL NOT NULL,
  y DECIMAL NOT NULL,
  z DECIMAL NOT NULL,
  PRIMARY KEY(idPlaneta)
);

CREATE TABLE Viagem(
	idViagem INT NOT NULL AUTO_INCREMENT,
	dataSaida DATE NOT NULL,
	dataChegada DATE NOT NULL,
	tempoViagem LONG,
	PRIMARY KEY (idViagem)
);

CREATE TABLE Nave(
	idNave INT NOT NULL AUTO_INCREMENT,
  idViagem INT NOT NULL,
	nomeNave VARCHAR(100) NOT NULL,
	velocidadeMedia DECIMAL(7,3) NOT NULL,
	numeroTripulantes INT NOT NULL,
	numeroPassageiros INT NOT NULL,
	autonomiaViagem INT,
	PRIMARY KEY (idNave),
	FOREIGN KEY (idViagem) 
		REFERENCES Viagem (idViagem)
);

CREATE TABLE Tripulante (
	idTripulante INT NOT NULL AUTO_INCREMENT,
  idNave INT NOT NULL,
	nomeTripulante VARCHAR(100) NOT NULL,
	classificacao INT,
	funcao VARCHAR(100) NOT NULL,
	cpf INT NOT NULL UNIQUE,
	rg  INT NOT NULL UNIQUE,
	endereco VARCHAR(255),
	PRIMARY KEY (idTripulante),
	FOREIGN KEY (idNave)
		REFERENCES Nave (idNave)
);

CREATE TABLE ViagemPlaneta(
	idViagemPlaneta INT NOT NULL AUTO_INCREMENT,
  idViagem INT NOT NULL,
  idPlaneta INT NOT NULL,
	PRIMARY KEY (idViagemPlaneta),
	FOREIGN KEY (idViagem)
		REFERENCES Viagem (idViagem),
	FOREIGN KEY (idPlaneta)
		REFERENCES Planeta (idPlaneta)
);
