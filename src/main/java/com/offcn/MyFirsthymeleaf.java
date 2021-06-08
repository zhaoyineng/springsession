package com.offcn;

import com.offcn.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@Controller
public class MyFirsthymeleaf {


    @RequestMapping("/first")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        model.addAttribute("message", message);
        return "index01";
    }



    @RequestMapping("/seconden")
    public String index02(Model model) {

        user use = new user("01","展昭","23");


     Map<Object, Object> M = new HashMap<>();
     M.put("src1","02");
     M.put("src2","03");




        model.addAttribute("Map",M);
        model.addAttribute("user",use);




        return "index02";
    }


}
