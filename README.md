# Banking System  using Java Spring Boot Microservices


For this project, I will elucidate the utilization of internet banking APIs within a microservices architecture built on the Spring Boot framework. 
I'll start by crafting the foundational API, which will progress into a comprehensive REST API ensemble prior to deployment.

## Microservices Inside This Project

- User service (banking-core-user-service) – This service includes all the operations under the User such as registrations and retrieval. Additionally, this API consumes keycloak REST API to register and manage the user base while using the local PostgreSQL database as well.
- Fund transfer service (banking-core-fund-transfer-service) This is the service that handles all the fund transfers between accounts and this API will push messages to a centralized RabbitMQ queue to use from the Notification service.
- Payment service (banking-core-payments-service) – This service will include all the API endpoints to process Utility payments in this project and that will push notification messages to RabbitMQ as well.
- Notification service – This API is registered under the service registry but consumes all the messages from RabbitMQ and pushes necessary notifications to the end users.
- Banking core service – This is the banking core service that acts as a dummy banking core with accounts, users, transaction details, and processors for banking transactions.
## Technology
- Java 11
- Spring Boot 2.4.5
- Netflix Eureka Service Registry
- Netflix Eureka Service Client
- Spring Cloud API Gateway
- Spring Cloud Config Server
- Zipkin
- Spring Cloud Sleuth
- Open Feign
- RabbitMQ
- Prometheus
- Jitpack
- MySQL
- Keycloak
- Docker / Docker Compose
- Keycloak
