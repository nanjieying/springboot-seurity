package com.itnan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan
 * @ClassName SpringSecurityApplication.java
 * @createTime 2022年05月26日 10:58:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.itnan.mapper"}) //扫描DAO
public class SpringSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class);
    }
}
