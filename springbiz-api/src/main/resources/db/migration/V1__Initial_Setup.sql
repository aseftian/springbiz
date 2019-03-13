CREATE TABLE t_users (
	id INT NOT NULL AUTO_INCREMENT,
	username VARCHAR(50) NOT NULL,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NULL,
	email VARCHAR(50) NULL,
	password VARCHAR(50) NOT NULL,
	created_at TIMESTAMP NULL,
	updated_at TIMESTAMP NULL,
	created_by VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY (id),
	UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_users(username, first_name, last_name, email, password, created_at, created_by)
	VALUES('admin', 'Admin', 'Super', '', 'springbiz123', curdate(), 'system');

CREATE TABLE t_product_categories(
   id INT NOT NULL AUTO_INCREMENT,
   code VARCHAR(10) NOT NULL,
	name VARCHAR(50) NOT NULL,
	created_at TIMESTAMP NULL,
	updated_at TIMESTAMP NULL,
	created_by VARCHAR(50) NULL,
   PRIMARY KEY (id),
   UNIQUE KEY UK_code (code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_product_categories(code, name, created_at, created_by)
	VALUES('GMS','Gamis ', curdate(), 'system');

CREATE TABLE t_product_attr_master(
	id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   type VARCHAR(20) NULL,
   description VARCHAR(50) NULL,
   PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_product_attr_master(name, type, description)
	VALUES('SIZE','String','Ukuran');

CREATE TABLE t_products(
	id INT NOT NULL AUTO_INCREMENT,
	sku VARCHAR(20) NOT NULL,
	name VARCHAR(100) NOT NULL,
	category_id INT NOT NULL,
	created_at TIMESTAMP NULL,
	updated_at TIMESTAMP NULL,
	created_by VARCHAR(50) NULL,
   PRIMARY KEY (id),
   UNIQUE KEY UK_code (sku)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_products(sku, name, category_id, created_at, created_by)
	VALUES('CARPO001','Cardigan Polos', 1, curdate(), 'system');