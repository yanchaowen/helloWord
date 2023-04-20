package com.example.helloword;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
public class demoApplicationTest {
   //测试数据库链接
    /*
    @Autowired
    private DataSource dataSource;
    @Test
    void contextLoads(){
        try {
         System.out.println(dataSource.getConnection());
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
     */
    //测试数据查询
    @Resource
    private userMapper usermapper;
    @Test
    void contextLoads(){
        System.out.println(usermapper.findById(3));
    }

}
