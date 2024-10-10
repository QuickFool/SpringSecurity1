package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;

import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // Метод для получения всех ролей
    @Transactional(readOnly = true)
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    // Метод для подгрузки ролей с пользователями
    @Transactional(readOnly = true)
    public Set<Role> findAllWithUsers() {
        return roleRepository.findAllWithUsers();
    }

    // Метод для подгрузки конкретной роли с пользователями
    @Transactional(readOnly = true)
    public Role findByIdWithUsers(Long id) {
        return roleRepository.findByIdWithUsers(id);
    }
}
