package com.gioov.spiny.common.druid;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author godcheese
 * @date 2018-02-22
 */
@Configuration
public class DruidConfiguration {

    public static final String DRUID_URL = "/druid";

    /**
     * DataSource 配置注入
     *
     * @return
     * @Primary 注释在同样的 DataSource 中，首先使用被标注的 DataSource
     * 声明其为 Bean 实例
     */
    @Primary
    @Bean(destroyMethod = "close", initMethod = "init")
    @ConfigurationProperties("spring.datasource.druid")
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }

}
