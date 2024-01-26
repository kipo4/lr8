package ru.frolov.springsecurity2db.service;

import ru.frolov.springsecurity2db.dto.UserDto;
import ru.frolov.springsecurity2db.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
