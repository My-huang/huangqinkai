package io.hqk.jcartadministrayionback.controller;

import io.hqk.jcartadministrayionback.dto.out.AdministratorDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {


    @GetMapping("/list")
    public List<AdministratorDTO> list(@RequestParam String username,
                                       @RequestParam String encrypted_password){

        return null;
    }

    @GetMapping("/show")
    public String show(@RequestParam Integer administrator_id){

        return null;
    }

    @PostMapping("/update")
    public Integer update(@RequestParam Integer administrator_id){

        return 0;
    }

    @PostMapping("/login")
    public String login(@RequestParam String real_name,
                        @RequestParam String encrypted_password){
        return null;
    }


    @PostMapping("/updateprofile")
    public AdministratorDTO updateProfile(@RequestPart AdministratorDTO administratorDTO){

        return null;
    }

    @PostMapping("/resetpwd")
    public Integer reserPwd(@RequestParam String real_name,
                            @RequestParam String encrypted_password){

        return 0;
    }


}
