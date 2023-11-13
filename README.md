
# Purchase Order Service

This is a Spring Boot service that allows the purchase of items and sends a purchase confirmation email using JavaMailSender.

## Features

- Purchase items with prices.
- Calculate the total bill amount.
- Send a purchase confirmation email with an attachment.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java installed
- Maven installed
- An SMTP server for sending emails
- Set up the `application.properties` file with the appropriate mail configuration.

## Configuration

Update the `application.properties` file with the necessary email configuration:

```properties
spring.mail.username
spring.mail.password   etc
