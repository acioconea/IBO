-- Drop table if exists for all tables
DROP TABLE IF EXISTS Stocks;
DROP TABLE IF EXISTS Bonds;
DROP TABLE IF EXISTS FuturesContracts;
DROP TABLE IF EXISTS OptionsContracts;

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

-- Create table for Bonds
CREATE TABLE Bonds (
    id INT AUTO_INCREMENT PRIMARY KEY,
    country VARCHAR(255) NOT NULL,
    nrYears INT,
    interestRate FLOAT,
    issuer VARCHAR(255),
    issueDate DATE
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
