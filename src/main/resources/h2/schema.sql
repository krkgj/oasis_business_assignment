DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS contract_company;
DROP TABLE IF EXISTS supply;
DROP TABLE IF EXISTS supply_book;

CREATE TABLE book(
seq INT PRIMARY KEY,
book_title VARCHAR(50),
category VARCHAR(30),
issue_date DATE,
quantity INT,
author VARCHAR(50),
net_price DECIMAL(7, 2),
supply_price DECIMAL(7, 2),
discount_rate DECIMAL(5, 3),
status VARCHAR(20)
);

CREATE TABLE contract_company(
seq INT PRIMARY KEY,
cntrc_date DATE,
lwst_rate DECIMAL(5, 3),
status_code VARCHAR(10)
);

CREATE TABLE supply(
seq INT PRIMARY KEY,
contract_company_seq INT,
supply_date DATE
);

CREATE TABLE supply_book(
seq INT PRIMARY KEY,
supply_seq INT,
book_seq INT,
FOREIGN KEY (supply_seq) REFERENCES supply(seq) ON UPDATE CASCADE,
FOREIGN KEY (book_seq) REFERENCES book(seq) ON UPDATE CASCADE
);