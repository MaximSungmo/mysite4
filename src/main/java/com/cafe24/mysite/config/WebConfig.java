package com.cafe24.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.cafe24.config.web.FileuploadConfig;
import com.cafe24.config.web.MVCConfig;
import com.cafe24.config.web.MessageConfig;
import com.cafe24.config.web.SecurityConfig;

@Configuration
// configDriven
@EnableWebMvc
@EnableAspectJAutoProxy
// ComponentScan은 지정된 위치에서 컴포넌트를 스캐닝하라는 의미 
@ComponentScan({"com.cafe24.mysite.controller", "com.cafe24.mysite.exception"})
@Import({MVCConfig.class, SecurityConfig.class, MessageConfig.class, FileuploadConfig.class})

public class WebConfig {

	
	
}
