package io.hqk.jcartadministrationback.service.impl;

import io.hqk.jcartadministrationback.po.Administrator;
import io.hqk.jcartadministrationback.service.AdministratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AdministratorServiceImplTest {

    @Autowired
    private AdministratorService administratorService;

    @Test
    void getByUsername() {
        String username = "admin";
        Administrator byUsername = administratorService.getByUsername(username);
        assertNotNull(byUsername);

        username = "admin00";
         byUsername = administratorService.getByUsername(username);
        assertNotNull(byUsername);


    }
}