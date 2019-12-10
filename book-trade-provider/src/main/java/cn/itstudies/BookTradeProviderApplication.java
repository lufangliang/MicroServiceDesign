package cn.itstudies;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.itstudies.trade.mapper")
@SpringBootApplication
public class BookTradeProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookTradeProviderApplication.class, args);
	}

}
