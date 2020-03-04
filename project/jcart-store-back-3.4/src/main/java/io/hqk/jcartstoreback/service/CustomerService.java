package io.hqk.jcartstoreback.service;

import io.hqk.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.hqk.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}
