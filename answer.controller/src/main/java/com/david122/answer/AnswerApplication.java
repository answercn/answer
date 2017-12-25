package com.david122.answer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by WangHui on 17/12/01.
 */
@SpringBootApplication
@MapperScan("com.david122.answer.dao")
//默认扫描AnswerApplication同层及下级的目录的注解
//@ComponentScan(basePackages = {"com.ali.seal.sealing"})
//通过spring boot的main入口启动，内嵌tomcat
public class AnswerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnswerApplication.class, args);
	}
	
}
