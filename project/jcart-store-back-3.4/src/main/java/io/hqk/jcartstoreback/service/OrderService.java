package io.hqk.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.hqk.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.hqk.jcartstoreback.dto.out.OrderShowOutDTO;
import io.hqk.jcartstoreback.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                     Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
