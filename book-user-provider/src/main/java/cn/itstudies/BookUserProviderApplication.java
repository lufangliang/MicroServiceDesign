package cn.itstudies;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.itstudies.user.mapper")
@SpringBootApplication
public class BookUserProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookUserProviderApplication.class, args);
	}

}
