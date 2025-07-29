package newcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usersss")
public class Users {

    @GetMapping
    public String getUsers() {
        return "Hello world";
    }
}
