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

	/*
			Allows configuring and using Tomcat and TomEE application
			servers directly from IntelliJ IDEA, for deploying and
			running/debugging web and enterprise applications.
	 */
	public static void main(String[] args) {
		SpringApplication.run(GmallGeneratorApplication.class, args);
	}
}
