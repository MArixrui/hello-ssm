package com.xrstandard.springboot.ssm.hellossm;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@MapperScan(basePackages="com.xrstandard.springboot.ssm.hellossm.mapper" )
@SpringBootApplication
@EnableTransactionManagement
public class HelloSsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSsmApplication.class, args);
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDataSource(){
        return new DruidDataSource();
    }

}
