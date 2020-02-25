package io.hqk.jcartadministrayionback.controller;

import io.hqk.jcartadministrayionback.dto.in.ClientDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping("/search")
    public String search(@RequestParam String username,
                         @RequestParam Date createTime ){

        return null;
    }

    @GetMapping("/login")
    public List<ClientDTO> login(@RequestParam String username,
                                 @RequestParam String createTime){

        return null;
    }

    @PostMapping("/updateprofile")
    public ClientDTO updateProfile(@RequestParam Integer ClientId){

        return null;
    }

    @PostMapping("/changepassword")
    public Integer changePassword(@RequestParam String username,
                                  @RequestParam String createTime){

        return 0;
    }

    @PostMapping("/add")
    public Integer add(@RequestPart ClientDTO clientDTO){

        return 0;
    }

}
