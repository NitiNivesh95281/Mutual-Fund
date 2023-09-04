
# Mutual Fund Investment Platform 📈

#### *A comprehensive platform to manage, track, and execute mutual fund investments*

## Overview

This project offers users the ability to view mutual fund details, invest in them, track investments, and execute buy/sell transactions. With a seamless authentication process and an intuitive interface, users can effortlessly navigate their investment journey.




##   Features

* **User Authentication**: Secure login system for investors.

* **Investment Tracking**: View all the mutual funds an investor has invested in with transaction history.

* **Buy/Sell Transactions**: Execute buy or sell transactions with up-to-date NAV values.

* **Dynamic NAV Calculation**: Calculates NAV based on stock prices and their weights in the mutual fund.

* **Wallet Management**: Ensure users don't invest more than their wallet balance.# Installation Guide for Mutual_Fund_Project

This guide will walk you through the steps to set up and run Mutual_Fund_Project locally using the Spring Tool Suite (STS).

## Prerequisites

- Java JDK (Version 8 or newer)
- Spring Tool Suite (STS) IDE
- Oracle Database 

## Steps to Set Up and Run

### 1. Clone the Repository

First, you need to clone the project repository from GitHub (or wherever your source code is hosted):

```bash
  git clone https://github.com/ayushvarma7/Mutual_Fund_Project.git
```

### 2. Import the Project in STS

1. Open STS.
2. Go to `File` > `Import...` > `Existing Maven Projects`.
3. Navigate to the directory where you cloned the repository and select the project.

### 3. Configure Database

1. Start your Oracle Database instance.
2. Ensure that the database connection details in `application.properties` (or wherever you have placed the DB configuration) match your Oracle DB settings.
3. Update the following lines in `application.properties`:

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:orcl
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD
```

### 4. Run the Application

1. In STS, right-click the project in the `Project Explorer`.
2. Select `Run As` > `Spring Boot App`.

The application should start, and you'll be able to access the available endpoints. For API details, refer to the [API Reference section](#api-reference).

View the Frontend of the project at [Mutual_Fund_Project_Frontend](https://github.com/ayushvarma7/Mutual_Fund_Project_Frontend)

## Troubleshooting

1. **Database Connection Issues**: Ensure that your Oracle Database instance is running and that the credentials in `application.properties` are correct.
2. **Dependency Issues**: Right-click on the project, choose `Maven` > `Update Project`. Make sure "Force Update of Snapshots/Releases" is selected.




## 🚀 API Reference 


### 🛡 User Authentication

### Investor Controller
- **POST** `/login`: Authenticate and login an investor.
- **GET** `/investors`: Retrieve all investors.
- **POST** `/`: Add a new investor.
- **GET** `/investors/id/{investorid}`: Get information of a specific investor by investor ID.
- **POST** `/register`: Register a new investor.

### 💰 Investments

### Investment Controller
- **GET** `/investments`: Retrieve all investments.
- **POST** `/investments/add`: Add a new investment.
- **GET** `/investments/id/{investorid}`: Get investments by an investor ID.
- **GET** `/investments/investmentid/{investmentId}`: Get a specific investment by investment ID.
- **GET** `/investments/getunits/{investorId}/{fundId}`: Get total units for an investor for a specific fund.

### 🌐 Mutual Funds

### Mutual Fund Controller
- **GET** `/mutualfunds`: Retrieve all mutual funds.
- **POST** `/mutualfund/add`: Create a new mutual fund.
- **GET** `/mutualfunds/id/{mfid}`: Get information of a specific mutual fund by its ID.
- **GET** `/mutualfund/getstockweights/{mfid}`: Get stock composition for a specific mutual fund.
- **GET** `/investor/mfs/{investorId}`: Get list of mutual funds invested in by a specific investor.

### 🧑 Portfolio Manager

### Portfolio Manager Controller
- **GET** `/portfoliomanagers`: Retrieve all portfolio managers.
- **POST** `/portfoliomanagers/add`: Add a new portfolio manager.
- **GET** `/portfoliomanagers/getAllMF/{managerId}`: Get all mutual funds associated with a specific manager ID.

### 💸 Investments

### Stock Controller
- **GET** `/stocks`: Retrieve all stocks.
- **GET** `/stocks/byid`: Special route to retrieve stocks by ID (Purpose not clear from provided data).
- **POST** `/stocks/add`: Add a new stock.
- **GET** `stocks/id/{stockId}`: Get information of a specific stock by its ID.

### 💰 Fund composition

### StocksInFund Controller
- **GET** `/stocksinfund`: Retrieve all stocks in funds.
- **POST** `/stocksinfund/add`: Add stocks weight.

---


## Tech Stack


**Backend**: Spring Boot, Java Persistence API, MVC Framework

**Database**: Oracle SQL, DBeaver, SQL Plus 


## Authors

- [@ayushvarma7](https://www.github.com/ayushvarma7)

## Feedback and Contributions

If you encounter any issues or would like to contribute to the project, please [open an issue on GitHub](https://github.com/ayushvarma7/Mutual_Fund_Project/issues) or send a pull request.
