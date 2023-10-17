package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller //Annotation
public class AudioContrioller {
    @RequestMapping("/audio") //요청 , 이름 중복x
    public String home(){
        
        return( "home" );//home.html 작성
    }
}
