CREATE TABLE t_users (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	username varchar(100) NOT NULL,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) DEFAULT NULL,
	email varchar(50) DEFAULT NULL,
	password varchar(50) NOT NULL,
	created_at time
	PRIMARY KEY (id),
	UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_users(username, first_name, last_name) VALUES('ardist', 'Ardi', 'Seftian');

CREATE TABLE t_products(
	id integer NOT NULL AUTO_INCREMENT,
	code varchar(20) NOT NULL,
	name varchar(100) NOT NULL,
	category_id integer NOT NULL,
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;