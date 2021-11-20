/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csb.samplefullstack.controller;
import com.csb.samplefullstack.computations.Computation;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController 
@RequestMapping("/api/v1/greet")  
@CrossOrigin("*")
/**
 *
 * @author Jared Orin Velasco
 */
public class Greet {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!" + Computation.sumOfTwoNums();
    }
    
    @RequestMapping("/hi")
    public String hi(){
        return "hi world!";
    }
}
