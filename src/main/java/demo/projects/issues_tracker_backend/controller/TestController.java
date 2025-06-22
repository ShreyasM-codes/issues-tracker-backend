package demo.projects.issues_tracker_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/hello")
    public String hello(@RequestParam String input) {
        return String.format("Hello from backend! You have selected: %s  ", input);
    }

     @GetMapping("/api/test")
    public String test() {
        return "This is test message..";
    }
}
