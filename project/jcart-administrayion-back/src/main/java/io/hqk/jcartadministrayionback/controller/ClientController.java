package io.hqk.jcartadministrayionback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping("/search")
    public String search(String username, Date createTime ){

        return null;
    }

}
