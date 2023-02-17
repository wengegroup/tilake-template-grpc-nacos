package com.wenge.tilake.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author haobao
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DataServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.wenge.tilake.data.DataServerApplication.class, args);
    }
}
