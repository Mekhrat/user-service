package kz.bitlab.userservice.service;

import kz.bitlab.userservice.entities.User;
import kz.bitlab.userservice.mapper.UserMapper;
import kz.bitlab.userservice.model.UserDto;
import kz.bitlab.userservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserDto> getAll() {
        return userMapper.toDtoList(userRepository.findAll());
    }

    public UserDto get(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(userMapper::toUserDto).orElse(null);
    }

    public UserDto save(UserDto dto) {
        return userMapper.toUserDto(userRepository.save(userMapper.toUser(dto)));
    }
}
