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
	VALUES('admin', 'Admin', 'Super', 'admin@springbiz.com', 'springbiz123', curdate(), 'system');

CREATE TABLE t_categories(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    description VARCHAR(100) NULL,
	created_at TIMESTAMP NULL,
	updated_at TIMESTAMP NULL,
	created_by VARCHAR(50) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_categories(name, created_at, created_by)
	VALUES('Gamis', curdate(), 'system');

CREATE TABLE t_products(
	id INT NOT NULL AUTO_INCREMENT,
	sku VARCHAR(20) NOT NULL,
	name VARCHAR(100) NOT NULL,
    unit_price DOUBLE NOT NULL,
    disc DOUBLE NULL DEFAULT '0',
	created_at TIMESTAMP NULL,
	updated_at TIMESTAMP NULL,
	created_by VARCHAR(50) NULL,
   PRIMARY KEY (id),
   UNIQUE KEY UK_code (sku)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_products(sku, name, price, created_at, created_by)
	VALUES('CARPO001','Cardigan Polos', 45000.00, curdate(), 'system');

CREATE TABLE t_product_categories(
   id INT NOT NULL AUTO_INCREMENT,
   product_id INT NOT NULL,
   category_id INT NOT NULL,
   PRIMARY KEY (id),
   CONSTRAINT fk_product FOREIGN KEY (product_id) 
  REFERENCES t_products(id),
  CONSTRAINT fk_category FOREIGN KEY (category_id) 
  REFERENCES t_categories(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE t_product_attributes(
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    type VARCHAR(20) NULL,
    description VARCHAR(50) NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_product_attributes(name, type, description)
	VALUES('SIZE','String','Ukuran');

CREATE TABLE t_product_details(
	id BIGINT NOT NULL AUTO_INCREMENT,
    product_id INT NOT NULL,
    attribute_id INT NOT NULL,
    value VARCHAR(20),
    description VARCHAR(50),
	created_at TIMESTAMP NULL,
	updated_at TIMESTAMP NULL,
	created_by VARCHAR(50) NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_product_details(product_id, attribute_id, value, description)
	VALUES(1,1,'S','Small');

CREATE TABLE t_orders(
	id INT NOT NULL AUTO_INCREMENT,
    invoice_number VARCHAR(50) NOT NULL,
    order_date DATETIME NOT NULL,
    order_channel VARCHAR(30),
    total DOUBLE NOT NULL,
    disc DOUBLE NULL DEFAULT '0',
    shipping_date DATE NULL,
    shipping_courier VARCHAR(30) NULL,
    shipping_courier_type VARCHAR(50) NULL,
    shipping_fee DOUBLE NULL,
    shipping_receipt_number VARCHAR(50) NULL,
    payment_method VARCHAR(50) NULL,
    payment_bank VARCHAR(50) NULL,
    notes VARCHAR(100) NULL,
	created_at TIMESTAMP NULL,
	updated_at TIMESTAMP NULL,
	created_by VARCHAR(50) NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
