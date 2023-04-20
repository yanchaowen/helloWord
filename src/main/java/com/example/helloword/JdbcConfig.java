package com.example.helloword;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration //表明当前类为配置类
@PropertySource("classpath:jdbc.properties") //指定属性配置文件路径
public class JdbcConfig {
    //属性注入
    @Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;
    //把datasource方法声明分为一个Bean的方法,Springboot会自动调用该方法,将方法的返回值加入到Spring容器中.
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Override
    public String toString() {
        return "jdbcconfig{"+'\n'+
                "driverClassName："+driverClassName+'\n'+
                "url:"+url+'\n'+
                "username:"+username+'\n'+
                "password:"+password+'\n'+
                "}";
    }
}
