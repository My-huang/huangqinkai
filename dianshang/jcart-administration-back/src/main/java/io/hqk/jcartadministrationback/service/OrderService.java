package io.hqk.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hqk.jcartadministrationback.dto.out.OrderListOutDTO;
import io.hqk.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.hqk.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
