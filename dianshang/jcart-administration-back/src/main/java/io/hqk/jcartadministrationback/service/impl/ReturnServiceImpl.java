package io.hqk.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.hqk.jcartadministrationback.dao.ReturnMapper;
import io.hqk.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.hqk.jcartadministrationback.po.Return;
import io.hqk.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReturnServiceImpl implements ReturnService {


    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Page<Return> searc(ReturnSearchInDTO returnSearchInDTO,Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<Return> search = returnMapper.search(returnSearchInDTO.getReturnId(),
                returnSearchInDTO.getOrderId(),
                new Date(returnSearchInDTO.getStartTimestamp()),
                new Date(returnSearchInDTO.getEndTimestamp()),
                returnSearchInDTO.getStatus(),
                returnSearchInDTO.getProductCode(),
                returnSearchInDTO.getCustomerName(),
                returnSearchInDTO.getCustomerName());
        return search;
    }
}
