package kr.june.commerce.account.controller;

import kr.june.commerce.account.dto.UserDto;
import kr.june.commerce.account.entity.UserEntity;
import kr.june.commerce.account.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/all")
    public Page<UserEntity> all(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(userService.getById(id));
    }

    @GetMapping("/users")
    public List<UserDto> userByName(@RequestParam("name") String name) {
        return userService.findByName(name);
    }
}
