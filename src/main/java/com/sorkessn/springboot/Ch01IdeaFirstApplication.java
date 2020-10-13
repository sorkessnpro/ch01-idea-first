package com.sorkessn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//springboot项目启动入口类
@SpringBootApplication //springboot核心注解，主要进行springboot自动配置
public class Ch01IdeaFirstApplication {
	//springboot项目代码必须放到这个类所在的同级目录或子目录
	public static void main(String[] args) {
		SpringApplication.run(Ch01IdeaFirstApplication.class, args);
	}

}
