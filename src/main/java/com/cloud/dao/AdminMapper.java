package com.cloud.dao;

import com.cloud.entity.Admin;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {

    int insert(Admin admin);

    int update(Admin admin);

    Page<Admin> query(Admin admin);

    Admin queryById(String uuid);
}