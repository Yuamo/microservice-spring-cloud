package com.yumao.cloud.conctroller;

import com.yumao.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("movie/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://127.0.0.1:7900/simple/"+id,User.class);
    }
}
