package com.example.helloword;

import com.example.helloword.Mapper.mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

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
    public mapper usermapper1;
    @Test
    void contextLoads(){
        Map<String, Object> map1 = usermapper1.findById(3);
        Set<Map.Entry<String, Object>> entries = map1.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            Object user = entry.getValue();
            System.out.println(user);
        }
    }
}
