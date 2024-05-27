# Company API Service

This Kotlin-based API service returns mocked information about a company and all its wallet details.

## Table of Contents

- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Service](#running-the-service)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

Follow these instructions to set up and run the project on your local machine for development and testing purposes.

### Prerequisites

Ensure you have the following installed on your local machine:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) (you can install it using Homebrew)
- [Gradle](https://gradle.org/install/) (optional, as the project includes the Gradle Wrapper)
- [Git](https://git-scm.com/downloads)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/murilloarturo/wallet_api.git
    ```

2. Navigate to the project directory:
    ```sh
    cd wallet_api
    ```

### Running the Service

1. Build the project using Gradle:
    ```sh
    ./gradlew build
    ```

2. Run the service:
    ```sh
    ./gradlew bootRun
    ```

The service will start on `http://localhost:8080`.

## API Endpoints

### Get Company Information

- **URL**: `/api/company`
- **Method**: `GET`
- **Response**:
  ```json
  {
    "name": "Murillo's Inc.",
    "wallets": [
        {
            "accountId": "7cf09a9e-6ebf-4d37-b551-bbb7ca9cc52f",
            "iconURL": "https://www.countryflags.com/wp-content/uploads/united-states-of-america-flag-png-large.png",
            "amount": {
                "amount": 198395.3700,
                "currency": "USD"
            },
            "creditType": "credit",
            "datetime": "2023-02-24"
        },
        {
            "accountId": "7c8df209-ef57-4860-87b8-aaed2ad27c64",
            "iconURL": "https://www.countryflags.com/wp-content/uploads/europe-flag-jpg-xl.jpg",
            "amount": {
                "amount": 2608.1200,
                "currency": "EUR"
            },
            "creditType": "debit",
            "datetime": "2024-01-12"
        },
        {
            "accountId": "38cf5cad-2bde-482f-831f-3a9d5a7766a4",
            "iconURL": "https://www.countryflags.com/wp-content/uploads/united-kingdom-flag-png-large.png",
            "amount": {
                "amount": 255000.0000,
                "currency": "GBP"
            },
            "creditType": "credit",
            "datetime": "2022-10-01"
        },
        {
            "accountId": "3463c3f4-19d8-4d20-9987-759abf54d9f0",
            "iconURL": "https://www.countryflags.com/wp-content/uploads/venezuela-flag-png-large.png",
            "amount": {
                "amount": 0.0001,
                "currency": "VEF"
            },
            "creditType": "debit",
            "datetime": "1990-12-26"
        },
        {
            "accountId": "86608a8a-007e-4f0e-bc91-080b8a0f3da3",
            "iconURL": "https://www.countryflags.com/wp-content/uploads/colombia-flag-png-large.png",
            "amount": {
                "amount": 450000000.0000,
                "currency": "COP"
            },
            "creditType": "debit",
            "datetime": "2015-04-17"
        },
        {
            "accountId": "9a78bfdd-b914-4ddd-b554-3db144863729",
            "iconURL": "https://www.countryflags.com/wp-content/uploads/south-korea-flag-png-large.png",
            "amount": {
                "amount": 74103430.0100,
                "currency": "KRW"
            },
            "creditType": "debit",
            "datetime": "2017-04-17"
        },
        {
            "accountId": "3766a576-ade9-41c9-8a85-6a1e53974e00",
            "iconURL": "https://www.countryflags.com/wp-content/uploads/japan-flag-png-large.png",
            "amount": {
                "amount": 8512087.1600,
                "currency": "JPY"
            },
            "creditType": "debit",
            "datetime": "2018-04-17"
        }
    ]
}
  ```
