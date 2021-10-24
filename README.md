# hrc/eho-contracts

## Project description

Eho-contracts is designed to facilitate exchange of contracts between clients of e-ho.ru.
Each client can create a standard agreement with its prerequisites, account information, address and 
a reference to its electronic signature (if exists). A client can also include desired conditions of payment
(prepayment, payment by installments etc.). Upon reaching an agreement the two sides of the contract choose 
which standard contract is used. Each client can download a number of standard contracts to choose from. Then the standard text is filled with the actual data taken from the
profiles of the parties. The generated text can be viewed by both parties, edited if needed, and signed
by electronic signatures if available.

## Getting Started

Download links:

SSH clone URL: ssh://git@github.com/AndreyMalevsky/eho-contracts.git

HTTPS clone URL: https://github.com/AndreyMalevsky/eho-contracts.git



These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

## Prerequisites

What things you need to install the software and how to install them.

```
for local run: docker-compose -f docker-compose.local.yml up -d 
```
Add `gradle.properties` file to project root dir

```
mavenUsername = 
mavenPassword = 
```
For credentials follow <a href="https://rdclr.jetbrains.space/p/hrc/packages/maven/maven/ru.eho/common-lib?v=0.0.1-SNAPSHOT">link</a> and click connect button

## Deployment

Add additional notes about how to deploy this on a production system.

## Resources

Read following <a href="https://rdclr.jetbrains.space/p/hrc/documents/Development/a/%D0%A0%D0%B5%D0%B3%D0%B8%D1%81%D1%82%D1%80%D0%B0%D1%86%D0%B8%D1%8F-%D0%B8-%D0%90%D0%B2%D1%82%D0%BE%D1%80%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D1%8F-%D1%81-KeyCloak">documentation</a> for keycloak local setup