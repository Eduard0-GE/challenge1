CREATE TABLE address(
	address_id SERIAL PRIMARY KEY,
	zip VARCHAR(8) NOT NULL,
	street VARCHAR(30) NOT NULL,
	complemet VARCHAR(15),
	neighborhood VARCHAR (15) NOT NULL,
	city VARCHAR(15)NOT NULL,
	state VARCHAR(2) NOT NULL,
	country VARCHAR(15) NOT NULL
)