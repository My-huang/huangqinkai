package io.hqk.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hqk.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.hqk.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.hqk.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
