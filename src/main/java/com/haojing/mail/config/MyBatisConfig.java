package com.haojing.mail.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.haojing.mail.mbg.mapper","com.haojing.mail.dao"})
public class MyBatisConfig {
}
