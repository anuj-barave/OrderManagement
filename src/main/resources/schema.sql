CREATE SEQUENCE IF NOT EXISTS customer_seq START 1;
CREATE TABLE IF NOT EXISTS Customer (
    id BIGINT DEFAULT nextval('customer_seq') PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    address VARCHAR(100) NOT NULL,
    phone VARCHAR(255) NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS food_seq START 1;
CREATE TABLE IF NOT EXISTS Food(
    id BIGINT DEFAULT nextval('food_seq') PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    price int NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS payment_seq START 1;

CREATE TABLE IF NOT EXISTS Payment(
    id BIGINT DEFAULT nextval('payment_seq') PRIMARY KEY,
    amount int NOT NULL,
    method VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    date DATE NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS order_seq START 1;
CREATE TABLE IF NOT EXISTS Orderapp(
    id BIGINT DEFAULT nextval('order_seq') PRIMARY KEY,
    customer_id BIGINT NOT NULL,
    payment_id BIGINT NOT NULL,
    date DATE,
    FOREIGN KEY (customer_id) REFERENCES Customer(id)  ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (payment_id) REFERENCES Payment(id) ON DELETE CASCADE ON UPDATE CASCADE
);

--order_items table as a junction table between order and food
CREATE TABLE IF NOT EXISTS order_items (
  order_id BIGINT,
  food_id BIGINT,
  PRIMARY KEY (order_id, food_id),
  FOREIGN KEY (order_id) REFERENCES Orderapp(id) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (food_id) REFERENCES Food(id) ON DELETE CASCADE ON UPDATE CASCADE
);