package com.cot.bankingapphibernate.controller;

import com.cot.bankingapphibernate.entity.Role;
import com.cot.bankingapphibernate.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAll() {
        return roleService.getAll();
    }

    @GetMapping("/{id}")
    public Role getById(@PathVariable long id) {
        return roleService.getById(id);
    }

    @PostMapping
    public Role create(@RequestBody Role role) {
        return roleService.create(role);
    }

    @PutMapping
    public Role update(@RequestBody Role role) {
        return roleService.update(role);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        roleService.delete(id);
    }
}
