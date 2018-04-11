package com.polarbear;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloRestController {
 
    @RequestMapping("/helloworld")
    public String home() {
        return "hello world";
    }
     
 
}