package io.hqk.jcartadministrationback.service;

import io.hqk.jcartadministrationback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);

}
