package com.ahri.springbootlearn.service.impl;

import com.ahri.springbootlearn.domain.Role;
import com.ahri.springbootlearn.mapper.RoleMapper;
import com.ahri.springbootlearn.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    public RoleMapper roleMapper;

    public List<Role> selectRoleList() {
        return roleMapper.selectRoleList();
    }

    @Override
    public List<Role> findAll() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Role("芙宁娜", "Furina", new Date(2023, Calendar.NOVEMBER, 13), "不休独舞", "4.3", "司颂座", 5));
        roles.add(new Role("八重神子", "Yae Miko", new Date(2023, Calendar.JULY, 27), "浮世笑百姿", "2.5", "仙狐座", 5));
        return roles;
    }
}
