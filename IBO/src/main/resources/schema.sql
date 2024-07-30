-- Drop table if exists for all tables
DROP TABLE IF EXISTS Stocks;
DROP TABLE IF EXISTS Bonds;
DROP TABLE IF EXISTS FuturesContracts;
DROP TABLE IF EXISTS OptionsContracts;
DROP TABLE IF EXISTS TransactionHistory;

-- Create table for Stocks
CREATE TABLE Stocks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price FLOAT,
    symbol VARCHAR(255),
    revenueGrowth FLOAT,
    dividendYield FLOAT,
    marketCapitalization BIGINT
);

CREATE TABLE BONDS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    country VARCHAR(255) NOT NULL,
    nr_years INT,
    interest_rate FLOAT,
    issuer VARCHAR(255),
    issue_date DATE
);

-- Create table for FuturesContracts
CREATE TABLE FuturesContracts (
    contractID INT AUTO_INCREMENT PRIMARY KEY,
    cashInstrumentID INT,
    expirationDate DATE,
    price FLOAT,
    issueDate DATE
);

-- Create table for OptionsContracts
CREATE TABLE OptionsContracts (
    contractID INT AUTO_INCREMENT PRIMARY KEY,
    cashInstrumentID INT,
    strikePrice FLOAT,
    expirationDate DATE,
    premium FLOAT,
    issueDate DATE
);

CREATE TABLE TransactionHistory (
    transactionID INT AUTO_INCREMENT PRIMARY KEY,
    instrumentID INT NOT NULL,
    instrumentType ENUM('Stock', 'Bond', 'Future', 'Option') NOT NULL,
    transactionDate DATE NOT NULL,
    transactionType ENUM('Buy', 'Sell') NOT NULL,
    quantity INT NOT NULL,
    pricePerUnit FLOAT NOT NULL,
    totalAmount FLOAT NOT NULL,
    broker VARCHAR(255),
    fees FLOAT
);
