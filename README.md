## API Gateway using spring cloud gateway

The API Gateway is an API management tool that sits between a client and a collection of backend services. It is a single entry point into a system that encapsulates the internal system architecture and provides an API that is tailored to each client. It also has other responsibilities such as authentication, monitoring, load balancing, caching, throttling, logging, etc.

### Prerequisite
- Download and run Keycloak https://www.keycloak.org/downloads. Keycloak is an open source software product to allow single sign-on with identity and access management aimed at modern applications and services. We will use OpenId/OAuth2 with help of Keycloak.
- Download and install redis for rate limitting.
- Download and Install Prometheus(https://prometheus.io/download/) for monitoring the APIs, you can also install grafana and integrate it with Prometheus for a better experience.

## Architecture
<img width="900" alt="Screen Shot 2024-02-24 at 4 44 41 PM" src="https://github.com/S-U-N-I-L/API-Gateway/assets/15266960/ab6f63d6-35df-41ce-95b0-d7600a795a09">

## How to run

- Start service registry app first, it should run om port 8761, verify on http://localhost:8761, this will show you Eureka Registry home page.
- Start Api Gateway, Product and order service on 8080, 8081 and 8082 ports.
- Once all three services are up and running, check on Eureka registry home page to verify all services registration with service registry.
- Start prometheus, this will monitor Api gateway application.
- Start redis for rate limitting.
