// package com.thomas_oliver.springbootdockerized.controller;

// import java.util.List;

// import com.thomas_oliver.springbootdockerized.model.User;
// import com.thomas_oliver.springbootdockerized.service.UserService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/users")
// public class UserController {
    
//     @Autowired
//     UserService userService;

//     @GetMapping("/get")
//     public List<User> findAll() {
//         System.out.println("finding in the controller");
//         return userService.findAll();
//     }

//     @PostMapping("/add")
//     public User add(@RequestBody User user) {
//         System.out.println("get in the controller");
//         return userService.add(user);
//     }

//     @DeleteMapping("/delete")
//     public String delete(Long id)
//     {
//         System.out.println("delete in the controller");
//         return userService.delete(id);
//     }
// }
