package io.hqk.jcartstoreback.service.impl;

import io.hqk.jcartstoreback.dao.ReturnMapper;
import io.hqk.jcartstoreback.po.Return;
import io.hqk.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Integer cueate(Return aReturn) {
        returnMapper.insertSelective(aReturn);
        Integer returnId = aReturn.getReturnId();
        return returnId;
    }
}
