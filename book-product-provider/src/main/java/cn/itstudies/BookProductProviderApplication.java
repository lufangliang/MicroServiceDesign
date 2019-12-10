package cn.itstudies;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.itstudies.product.mapper")
@SpringBootApplication
public class BookProductProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookProductProviderApplication.class, args);
	}

}
