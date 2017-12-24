package com.ali.seal.sealing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by WangHui on 17/12/01.
 */
@SpringBootApplication
@MapperScan("com.ali.seal.sealing.dao")
//默认扫描SealingApplication同层及下级的目录的注解
//@ComponentScan(basePackages = {"com.ali.seal.sealing"})
//通过spring boot的main入口启动，内嵌tomcat
public class SealingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SealingApplication.class, args);
	}
	
}

//public class SealingApplication extends SpringBootServletInitializer{
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(this.getClass());
//    }
//
//}
