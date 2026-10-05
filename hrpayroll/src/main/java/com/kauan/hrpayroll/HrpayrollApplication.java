package com.kauan.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@RibbonClient(name = "hr-worker")
public class HrpayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrpayrollApplication.class, args);
	}

}
