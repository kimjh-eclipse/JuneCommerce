package kr.june.commerce.controllers;

import kr.june.commerce.accounts.models.User;
import kr.june.commerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository repository;

    @GetMapping("/users")
    Page<User> all(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @GetMapping("/users/{name}")
    Page<User> userByName(@PathVariable("name") String name, Pageable pageable) {
        return repository.findByName(name, pageable);
    }
}
