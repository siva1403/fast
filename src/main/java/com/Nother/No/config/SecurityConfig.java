//package com.Nother.No.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity // Enable Spring Security’s web security support
//@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true) // To configure method-level security
//public class SecurityConfig {
//
//  @Bean
//  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//      http.cors().and().csrf().disable()
//          .authorizeRequests(expressionInterceptUrlRegistry -> expressionInterceptUrlRegistry
//                  .anyRequest().authenticated())
//          .oauth2ResourceServer().jwt();
//      return http.build();
//  }
//}
