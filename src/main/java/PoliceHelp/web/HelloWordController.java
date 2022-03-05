package PoliceHelp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import PoliceHelp.service.HelloWorld;

@RestController
public class HelloWordController {

  @GetMapping("/helloworld")
  public String helloworld() {
    HelloWorld HelloWorldService = new HelloWorld();
    return HelloWorldService.getHelloWorld();
  }
}
