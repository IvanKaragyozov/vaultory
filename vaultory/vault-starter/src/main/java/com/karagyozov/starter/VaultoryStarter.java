package com.karagyozov.starter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "com.karagyozov.domain")
@EnableJpaRepositories(basePackages = "com.karagyozov.core.repositories")
@ComponentScan(basePackages = "com.karagyozov")
@SpringBootApplication
public class VaultoryStarter
{
    public static void main(final String[] args)
    {
        SpringApplication.run(VaultoryStarter.class, args);
    }
}