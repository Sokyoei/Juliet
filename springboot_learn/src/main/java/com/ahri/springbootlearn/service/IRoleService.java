package com.ahri.springbootlearn.service;

import com.ahri.springbootlearn.domain.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();

    public List<Role> selectRoleList();
}
