package io.hqk.jcartadministrayionback.controller;


import io.hqk.jcartadministrayionback.dto.in.OrderCheckoutInDTO;
import io.hqk.jcartadministrayionback.dto.out.OrderListOutDTO;
import io.hqk.jcartadministrayionback.dto.out.OrderShowOutDTO;
import io.hqk.jcartadministrayionback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
