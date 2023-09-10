package kz.bitlab.userservice.controllers;

import kz.bitlab.userservice.model.UserDto;
import kz.bitlab.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserDto get(@PathVariable Long id) {
        return userService.get(id);
    }

    @PostMapping
    public UserDto add(@RequestBody UserDto dto) {
        return userService.save(dto);
    }

}
