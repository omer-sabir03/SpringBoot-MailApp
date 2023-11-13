
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
#Properties to tell the mail protocol vendor
spring.mail.host=smtp.gmail.com
spring.mail.port=587

#Actual username,password of sender
spring.mail.username=uremail@gmail.com
spring.mail.password=password

#Property to trigger smtp
spring.mail.properties.mail.smtp.auth=false
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required = true
