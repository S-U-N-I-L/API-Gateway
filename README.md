## API Gateway using spring cloud gateway

The API Gateway is an API management tool that sits between a client and a collection of backend services. It is a single entry point into a system that encapsulates the internal system architecture and provides an API that is tailored to each client. It also has other responsibilities such as authentication, monitoring, load balancing, caching, throttling, logging, etc.

### Prerequisite
- Download and run Keycloak https://www.keycloak.org/downloads. Keycloak is an open source software product to allow single sign-on with identity and access management aimed at modern applications and services. We will use OpenId/OAuth2 with help of Keycloak.
- Download and install redis for rate limitting.
- Download and Install Prometheus(https://prometheus.io/download/) for monitoring the APIs, you can also install grafana and integrate it with Prometheus for a better experience.

## Architecture
<img width="900" alt="Screen Shot 2024-02-24 at 4 44 41 PM" src="https://github.com/S-U-N-I-L/API-Gateway/assets/15266960/ab6f63d6-35df-41ce-95b0-d7600a795a09">
