package io.hqk.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.cjf.jcartadministrationback.dto.out.OrderListOutDTO;
import io.cjf.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.cjf.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
