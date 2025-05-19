package com.example.managementsystembookstore;

import org.springframework.boot.SpringApplication;

public class TestManagementSystemBookStoreApplication {

    public static void main(String[] args) {
        SpringApplication.from(ManagementSystemBookStoreApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
