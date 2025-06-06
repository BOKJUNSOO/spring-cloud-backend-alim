package com.welab.backend_alim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient // Eureka 서버에 healthcheck 를 보내는 클라이언트 ( service discovery )
@SpringBootApplication
@EnableFeignClients // Fegin Client 어노테이션
public class BackendAlimApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendAlimApplication.class, args);
	}

}
