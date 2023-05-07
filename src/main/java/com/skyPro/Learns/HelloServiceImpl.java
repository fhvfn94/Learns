package com.skyPro.Learns;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "hello";
    }

/*    public String answerHello() {
        return "hello" + userName;
    }*/

}
