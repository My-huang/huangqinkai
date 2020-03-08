package io.hqk.jcartstoreback.service.impl;

import io.hqk.jcartstoreback.dao.OrderHistoryMapper;
import io.hqk.jcartstoreback.po.OrderHistory;
import io.hqk.jcartstoreback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }
}
