package com.thomas_oliver.springbootdockerized;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thomas_oliver.springbootdockerized.model.User;
import com.thomas_oliver.springbootdockerized.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;


@SpringBootApplication
@RestController
public class SpringBootDockerizedApplication {

	@RequestMapping("/main")
	public String home() {
		return "Hello Docker World!";
	}

	@Autowired
    UserService userService;

    @GetMapping("/get")
    public List<User> findAll() {
        System.out.println("finding in the controller");
        return userService.findAll();
    }

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        System.out.println("get in the controller");
        return userService.add(user);
    }

    @DeleteMapping("/delete")
    public String delete(Long id)
    {
        System.out.println("delete in the controller");
        return userService.delete(id);
    }


	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerizedApplication.class, args);
	}

}
