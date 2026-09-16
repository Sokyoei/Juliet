package com.ahri.springbootlearning.service;

import com.ahri.springbootlearning.domain.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();

    public List<Role> selectRoleList();
}
