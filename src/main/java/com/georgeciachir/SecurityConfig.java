package com.georgeciachir;

import com.azure.spring.aad.webapp.AADWebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * AADWebSecurityConfigurer (AADWSC) is an extension of Spring's WebSecurityConfigurer (WSC).
 * <p>
 * You must extend AADWSC to define your own custom configuration in the configure() method.
 * Be sure to call super.configure() first. This will set up all of your AuthN/AuthZ properly.
 * <p>
 * You may omit this by not extending the AADWSC class.
 * <p>
 * If you don't extend AADWSC or WSC, AAD boot starter will create a DefaultAADWebSecurityConfigurerAdapter
 * bean automatically, and define its own default http.authorizeRequests() rule (authorize ALL requests).
 * <p>
 * See DefaultAADWebSecurityConfigurerAdapter in com.azure.spring.aad.webapp.AADWebAppConfiguration
 */

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends AADWebSecurityConfigurerAdapter {

    @Value("${app.protect.authenticated}")
    private String[] protectedRoutes;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        // use required configuration from AADWebSecurityAdapter.configure:
        super.configure(http);
        // add custom configuration:
        http.authorizeRequests()
                .antMatchers(protectedRoutes).authenticated()     // limit these pages to authenticated users (default: /token_details)
                .antMatchers("/**").permitAll();                  // allow all other routes.
    }
}
