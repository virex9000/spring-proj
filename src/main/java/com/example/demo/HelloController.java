package com.example.demo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {

        return "Helo";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name)
    {
        return "hello"+name;

    }

    @PostMapping("greet")
    public String greet(@RequestBody GreetingRequest greetingRequest)
    {
        return "hello"+greetingRequest.getName();
    }

}
