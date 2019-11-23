package org.assignment.melongation.mapper;

import org.assignment.melongation.mapper.AdminMapper;
import org.assignment.melongation.pojo.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
public class AdminMapperTest {
    @Autowired
    private AdminMapper adminMapper;

    @Test

    public void testSaveAdmin()
    {
        Admin admin = new Admin(null, "tc", "tc", "", "123@qq.com");
        adminMapper.saveAdmin(admin);
        testSelectAllAdmin();
    }

    @Test

    public void testSelectAllAdmin() {
        List<Admin> admins = adminMapper.selectAllAdmin();
        for (Admin admin : admins) {
            System.out.println(admin.toString());
        }

    }

    @Test

    public void testDeleteAdminById(){
        adminMapper.deleteAdminById(1);
        testSelectAllAdmin();
    }

    @Test

    public void testSelectAdminById(){
        Admin admin = adminMapper.selectAdminById(1);
        System.out.println(admin);

    }

    @Test

    public void testUpdateAdmin(){
        Admin admin = adminMapper.selectAdminById(1);
        admin.setUsername("dsadsa");
        adminMapper.updateAdmin(admin);
        Admin admin1 = adminMapper.selectAdminById(1);
        System.out.println(admin1.toString());
    }

    @Test

    public void testSelectAdminByUsernameAndPassword(){
        Admin admin=adminMapper.selectAdminByUsernameAndPassword("童材","12345678");
        System.out.println(admin.toString());
    }

    @Test

    public void testSearchAdminByKeyword(){
        List<Admin> admins=adminMapper.searchAdminByKeyword("童");
        System.out.println(admins.toString());
    }

}
