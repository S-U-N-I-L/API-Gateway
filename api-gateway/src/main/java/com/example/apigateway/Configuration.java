package com.example.apigateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
import org.springframework.cloud.gateway.filter.factory.TokenRelayGatewayFilterFactory;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.util.RouteMatcher;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@org.springframework.context.annotation.Configuration
public class Configuration {

   /* @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {


        http.
                authorizeExchange()
                .pathMatchers("/actuator/**")
                .permitAll()
                        .and()
                                .authorizeExchange()
                                .anyExchange()
                                .authenticated()
                        .and()

                                                                .oauth2Login();


        return http.build();
    }*/
@Bean
    public SecurityWebFilterChain configureResourceServer(ServerHttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .authorizeExchange()
                .anyExchange().authenticated()
                .and()
                .oauth2ResourceServer().jwt().and()
                .and().build();
    }

    @Bean
    public KeyResolver keyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }



}
