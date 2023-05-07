package com.skyPro.Learns;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

/*    @GetMapping
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return helloService.answerHello(userName);
    }*/
}
