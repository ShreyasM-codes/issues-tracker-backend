package demo.projects.issues_tracker_backend.view.controller;

import demo.projects.issues_tracker_backend.app.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/user")
    public String getUser(@RequestBody User user){
        System.out.println(user);
        return String.format("Hello %s, you are %s", user.getName(), user.getGender());
    }
}
