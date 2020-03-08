package io.hqk.jcartadministrationback.service;

import io.hqk.jcartadministrationback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

}
