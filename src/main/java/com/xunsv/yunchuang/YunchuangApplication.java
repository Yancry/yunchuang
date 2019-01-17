package com.xunsv.yunchuang;
import com.yancary.dynamicds.EnableDynamicDS;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDynamicDS
@SpringBootApplication
@MapperScan("com.xunsv.yunchuang.dao")
public class YunchuangApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunchuangApplication.class, args);
    }
}

