package app.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @GetMapping("/hello")
    public String get() {
        System.out.println("hello world!");
        return "hello world!";
	}

}