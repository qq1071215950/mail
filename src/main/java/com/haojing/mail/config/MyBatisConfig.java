package com.haojing.mail.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.haojing.mail.mbg.mapper")
public class MyBatisConfig {
}
