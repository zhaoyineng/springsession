package com.offcn;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class Testforspringsession {


    @RequestMapping("/set")
    public  void setSession(HttpSession session){

            session.setAttribute("msg","Hellow");
    }



    @RequestMapping("/get")
    public  String getSession(HttpSession session){
     return (String) session.getAttribute("msg");
}
}
