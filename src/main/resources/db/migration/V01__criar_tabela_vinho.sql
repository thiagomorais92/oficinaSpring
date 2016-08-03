-- //TODO  mudar para SQL do postgres -- 
CREATE TABLE vinho(
	codigo bigint(20) primary key AUTO_INCREMENT,
	nome varchar(50) NOT NULL,
	tipo varchar(50) NOT NULL,
	safra INT NOT NULL,
	volume INT NOT NULL,
	valor decimal(10,2) NOT NULL
)