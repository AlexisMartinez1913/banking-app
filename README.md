# Banking Management System

This repository contains a banking management system developed with Spring Boot. The application allows for banking operations such as withdraw and depositing into, withdrawing from, creating, retrieving, and deleting bank accounts.

## Technologies Used

- **Spring Boot**: Main framework for building the application.
- **Spring Web**: For handling web requests and responses.
- **Spring Data JPA**: For the persistence layer and database access with MySQL.
- **Lombok**: To reduce boilerplate code.
- **Java**: Programming language used.
- **MySQL**: Relational database used.

## Features

- **Bank Account Management**:
  - Deposit into bank accounts.
  - Withdraw from bank accounts.
  - Create new bank accounts.
  - Retrieve all bank accounts.
  - Retrieve a bank account by ID.
  - Delete bank accounts.

## Main Endpoints

- **Deposit REST API**:
  - `PUT /accounts/{id}/deposit`: Deposits a specified amount into the account with the given ID.
  
- **Withdraw REST API**:
  - `PUT /accounts/{id}/withdraw`: Withdraws a specified amount from the account with the given ID.

- **Create Account REST API**:
  - `POST /accounts`: Creates a new bank account.

- **Get All Accounts REST API**:
  - `GET /accounts`: Retrieves a list of all bank accounts.

- **Get Account By ID REST API**:
  - `GET /accounts/{id}`: Retrieves the bank account with the given ID.

- **Delete Account REST API**:
  - `DELETE /accounts/{id}`: Deletes the bank account with the given ID.

## Installation and Configuration

1. Clone this repository:
    ```bash
    git clone https://AlexisMartinez1913/banking-app.git
    ```

2. Set up the MySQL database and update the database properties in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Usage

- Access the application at `http://localhost:8080`.
- Use the provided endpoints to manage bank accounts and perform deposits, withdrawals, creation, retrieval, and deletion of accounts.

## Contribution

If you would like to contribute to this project, please fork the repository and submit a pull request.
