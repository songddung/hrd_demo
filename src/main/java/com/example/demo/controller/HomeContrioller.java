package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller //Annotation
@Slf4j //log변수 사용가능
public class HomeContrioller {
    @RequestMapping("/") //요청 , 이름 중복x
    public String home( @RequestParam("PageNo") int PageNo ){
        System.out.println(PageNo);
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        System.out.println("print");
        return( "home" );//home.html 작성
    }
    @RequestMapping("/home2") 
    public String home2(){
        return( "home" );//응답결과가 HTML
    }
    @RequestMapping("/home3") 
    @ResponseBody //JSON으로 응답
    public List<String> home3(){ //자바의 리스트는 형태를 일치시켜야함.<>안에  
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        return( list ); //응답결과가 JSON []] 
    }
}
