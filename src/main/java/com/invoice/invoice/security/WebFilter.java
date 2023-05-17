package com.invoice.invoice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class WebFilter {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(requests -> {
                    requests
                            .requestMatchers("/").permitAll()
                            .anyRequest().authenticated();
                })
                .formLogin(form -> {
                    form
                            .loginPage("/login")               // Indique que je souhaite utilser mon propre thymeleaf
                            .usernameParameter("email")       // <input name="email">
                            .passwordParameter("password")    // <input name="password">
                            .permitAll()
                            .defaultSuccessUrl("/profile");
                })
                .logout(logout -> {
                    logout.logoutUrl("/logout");
                })
                .build();
    }
}
