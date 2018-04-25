package com.nalbam.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixMonitorApplication {

    public static void main(final String[] args) {
        SpringApplication.run(HystrixMonitorApplication.class, args);
    }

}
