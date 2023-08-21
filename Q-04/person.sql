CREATE TABLE person(
	person_id SERIAL PRIMARY KEY,
	name VARCHAR(25) NOT NULL,
	age INT NOT NULL,
	phone VARCHAR(9) UNIQUE,
	height FLOAT(2) NOT NULL,
	email VARCHAR(25)NOT NULL UNIQUE,
	cpf VARCHAR(11) NOT NULL UNIQUE,
	birthday DATE NOT NULL,
	address_id INT REFERENCES address(address_id) NOT NULL
)