package com.monster.security.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author CustomLZH
 * @version 1.0
 * @date 2022/10/20 2:11
 * @since JDK1.8
 */
@Configuration
public class LiquibaseConfig {

    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        // 设置数据库
        liquibase.setDataSource(dataSource);
        // 设置sql文件位置
        liquibase.setChangeLog("classpath:liquibase/liquibase-master.yml");
        return liquibase;
    }

}
