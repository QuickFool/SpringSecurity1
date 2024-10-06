package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findOne(Long id);

    User findByUsername(String username);  // Новый метод для поиска пользователя по имени

    boolean save(User user);

    void update(Long id, User updatedUser);

    void delete(Long id);
}
