package io.hqk.jcartadministrayionback.controller;

import io.hqk.jcartadministrayionback.dto.out.ReturnDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public String search(@RequestParam Integer orderId,
                         @RequestParam String customerName){

        return null;
    }

    public ReturnDTO sales(@RequestParam Integer returnHistoryId){

        return null;
    }

}
