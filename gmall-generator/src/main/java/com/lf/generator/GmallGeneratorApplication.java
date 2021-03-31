package com.lf.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangdp1688
 */
@SpringBootApplication
@MapperScan("com.lf.generator.dao")
public class GmallGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallGeneratorApplication.class, args);
	}
}
