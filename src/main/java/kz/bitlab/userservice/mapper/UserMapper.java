package kz.bitlab.userservice.mapper;

import kz.bitlab.userservice.entities.User;
import kz.bitlab.userservice.model.UserDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserDto dto);
    UserDto toUserDto(User user);
    List<User> toUserList(List<UserDto> dtoList);
    List<UserDto> toDtoList(List<User> users);
}
