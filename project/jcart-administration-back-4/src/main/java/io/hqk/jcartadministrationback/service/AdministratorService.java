package io.hqk.jcartadministrationback.service;

import io.hqk.jcartadministrationback.po.Administrator;

public interface AdministratorService {


    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);
}
