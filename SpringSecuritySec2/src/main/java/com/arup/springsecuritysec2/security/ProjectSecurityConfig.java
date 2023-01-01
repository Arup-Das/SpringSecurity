package com.arup.springsecuritysec2.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        System.out.println("Here....");
        http.authorizeHttpRequests()
                .requestMatchers("/account","/balance","/card","/loan").authenticated()
                .requestMatchers("/contact","/notice").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return http.build();
    }
}
