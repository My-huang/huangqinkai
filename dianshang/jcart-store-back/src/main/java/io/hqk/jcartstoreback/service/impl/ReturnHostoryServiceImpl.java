package io.hqk.jcartstoreback.service.impl;

import io.hqk.jcartstoreback.dao.ReturnHistoryMapper;
import io.hqk.jcartstoreback.po.ReturnHistory;
import io.hqk.jcartstoreback.service.ReturnHostoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReturnHostoryServiceImpl implements ReturnHostoryService {


    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> getByreturnID(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectByorderId(returnId);
        return returnHistories;
    }
}
