package com.spring.register.provider.springRegisterProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供启动类。
 * @author tangke
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerRegisterProvider {
	
	/**
	 * 主函数入口。
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServerRegisterProvider.class, args);
	}

}
