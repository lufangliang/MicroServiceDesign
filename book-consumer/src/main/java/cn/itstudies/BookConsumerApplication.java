package cn.itstudies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BookConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookConsumerApplication.class, args);
	}

}
