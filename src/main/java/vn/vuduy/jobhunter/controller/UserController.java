package vn.vuduy.jobhunter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.vuduy.jobhunter.domain.User;
import vn.vuduy.jobhunter.service.UserService;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/create")
    public String createNewUser() {

        User user = new User();
        user.setName("Vũ Duy");
        user.setEmail("vuduy@gmail.com");
        this.userService.handeCreateUser(user);
        return "Create User";
    }
}
