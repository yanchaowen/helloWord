package com.example.helloword.controller;

import com.example.helloword.Mapper.mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Set;

@Controller
public class htmlTestController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @Resource
    public mapper usermapper1;
    @RequestMapping(value = "/index1")
    public Model index1(Model model) {
        Map<String, Object> map1 = usermapper1.findById(3);
        Set<Map.Entry<String, Object>> entries = map1.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            Object user = entry.getValue();
            System.out.println(user);
        }
        return model.addAttribute("name", map1);

    }
}
