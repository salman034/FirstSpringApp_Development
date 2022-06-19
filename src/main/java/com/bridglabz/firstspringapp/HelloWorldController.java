package com.bridglabz.firstspringapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(value={"", "/", "/home"})
    public String sayHello(){
        return "Hello From Bridgetabz1|1";
    }

    @RequestMapping (value = {"/query"},  method = RequestMethod.GET)
    public String sayhellow(@RequestParam (value="name") String nane)
    {
        return "Hello" + nane +"!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello" + name + "!";

    }

    @PostMapping("/post")
    public String post(@RequestBody User user){
        return "Hello" + user.getFirstName() + user.getLastName()+"!";
    }

    @PutMapping("/put/{firstname}")
    public String put(@PathVariable String firstname,@RequestParam(value = "lastname") String lastname)
    {
        return "Hello " +firstname+lastname;
    }
}
