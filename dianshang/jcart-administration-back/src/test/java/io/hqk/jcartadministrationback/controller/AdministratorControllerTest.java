package io.hqk.jcartadministrationback.controller;

import io.hqk.jcartadministrationback.constant.ClientExceptionConstant;
import io.hqk.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.hqk.jcartadministrationback.dto.out.AdministratorLoginOutDTO;
import io.hqk.jcartadministrationback.exception.ClientException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AdministratorControllerTest {

    @Autowired
    private AdministratorController administratorController;

    @Test
    void login() throws ClientException {

        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("123456");
        AdministratorLoginOutDTO login = administratorController.login(administratorLoginInDTO);
        assertNotNull(login);

        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("123456");
        
        
        try {
            administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE,errCode);
        }
        
        
        
        
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("654321");

        try {
            login =  administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRCODE,errCode);
        }




    }




    @Test
    void loginWrongUsername(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin110");
        administratorLoginInDTO.setPassword("123456");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, errCode);
        }
    }

    @Test
    void loginWrongPassword(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("abcdef");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_PASSWORD_INVALID_ERRCODE, errCode);
        }
    }
}