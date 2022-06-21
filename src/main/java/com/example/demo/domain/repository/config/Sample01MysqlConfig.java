package com.example.demo.domain.repository.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = {
        "com.example.demo.domain.repository.sample01" }, entityManagerFactoryRef = "sample01EntityManager")
public class Sample01MysqlConfig {
    @Value("${spring.datasource.sample01.driverClassName}")
    private String driverClassName;
    @Value("${spring.datasource.sample01.url}")
    private String url;
    @Value("${spring.datasource.sample01.username}")
    private String username;
    @Value("${spring.datasource.sample01.password}")
    private String password;

    @Bean("sample01")
    @Primary
    public DataSource createDataSource() {
        return DataSourceBuilder
                .create()
                .driverClassName(driverClassName)
                .url(url)
                .username(username)
                .password(password)
                .build();
    }

    @Bean(name = "sample01EntityManager")
    @Primary
    public EntityManagerFactory mySqlEntityManagerFactory(@Qualifier("sample01") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource);
        factory.setPackagesToScan("com.example.demo.domain.entity");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.afterPropertiesSet();

        return factory.getObject();
    }
}
