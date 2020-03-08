package io.hqk.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import io.hqk.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.hqk.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.hqk.jcartadministrationback.dto.out.PageOutDTO;
import io.hqk.jcartadministrationback.dto.out.ReturnListOutDTO;
import io.hqk.jcartadministrationback.dto.out.ReturnShowOutDTO;
import io.hqk.jcartadministrationback.po.Return;
import io.hqk.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/return")
public class ReturnController {


    @Autowired
    private ReturnService returnService;


    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){

        Page<Return> page = returnService.searc(pageNum);

        List<ReturnListOutDTO> returnListOutDTOS = page.stream().map(aReturn -> {
            ReturnListOutDTO returnListOutDTO = new ReturnListOutDTO();
            returnListOutDTO.setReturnId(aReturn.getReturnId());
            returnListOutDTO.setOrderId(aReturn.getOrderId());
            returnListOutDTO.setCustomerId(aReturn.getCustomerId());
            returnListOutDTO.setCustomerName(aReturn.getCustomerName());
            returnListOutDTO.setProductCode(aReturn.getProductCode());
            returnListOutDTO.setProductName(aReturn.getProductName());
            returnListOutDTO.setStatus(aReturn.getStatus());
            returnListOutDTO.setCreateTimestamp(aReturn.getCreateTime().getTime());
            returnListOutDTO.setUpdateTimestamp(aReturn.getUpdateTime().getTime());
            return returnListOutDTO;
        }).collect(Collectors.toList());
        

        PageOutDTO<Object> objectPageOutDTO = new PageOutDTO<>();
        objectPageOutDTO.setTotal(page.getTotal());
        objectPageOutDTO.setPageSize(page.getPageSize());
        objectPageOutDTO.setPageNum(page.getPageNum());

        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
