package com.ahri.springbootlearn.controller;

import com.ahri.springbootlearn.domain.Role;
import com.ahri.springbootlearn.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private IRoleService roleService;

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/roles")
    public List<Role> getRoles() {
        return roleService.findAll();
    }

    @GetMapping("/select")
    public List<Role> selectRoleList() {
        return roleService.selectRoleList();
    }
}
