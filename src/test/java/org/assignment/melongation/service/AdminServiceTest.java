package org.assignment.melongation.service;

import org.assignment.melongation.mapper.AdminMapper;
import org.assignment.melongation.pojo.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AdminServiceTest {
    @Autowired
    AdminService adminService;
    @Autowired
    AdminMapper adminMapper;
    @Test
    public void testAddAdmin(){
        Admin admin = new Admin(null, "tc", "tc", "", "123@qq.com");
        adminService.addAdmin(admin);
        List<Admin> admins=adminMapper.selectAllAdmin();
        System.out.println(admins.toString());
    }
}
