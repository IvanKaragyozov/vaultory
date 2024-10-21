package com.karagyozov.starter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = "com.karagyozov.domain")
@SpringBootApplication
public class VaultoryStarter
{
    public static void main(String[] args)
    {
        SpringApplication.run(VaultoryStarter.class, args);
    }
}