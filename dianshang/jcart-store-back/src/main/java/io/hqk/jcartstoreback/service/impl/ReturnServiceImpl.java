package io.hqk.jcartstoreback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.hqk.jcartstoreback.dao.ReturnHistoryMapper;
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

    @Override
    public Page<Return> getPageCustOmId(Integer customerId, Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<Return> page = returnMapper.selectPageByCutomerID(customerId);
        return page;
    }

    @Override
    public Return getByid(Integer returnid) {
        Return aReturn = returnMapper.selectByPrimaryKey(returnid);
        return aReturn;
    }
}
