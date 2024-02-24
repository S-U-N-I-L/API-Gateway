API Gateway using spring cloud gateway

The API Gateway is an API management tool that sits between a client and a collection of backend services. It is a single entry point into a system that encapsulates the internal system architecture and provides an API that is tailored to each client. It also has other responsibilities such as authentication, monitoring, load balancing, caching, throttling, logging, etc.

<h4>Prerequisite</h4>
- Download and run Keycloak https://www.keycloak.org/downloads. Keycloak is an open source software product to allow single sign-on with identity and access management aimed at modern applications and services. We will use OpenId/OAuth2 with help of Keycloak.
- Download and install redis for rate limitting.
