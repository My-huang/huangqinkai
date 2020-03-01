package io.hqk.jcartadministrationback.service.impl;

import io.hqk.jcartadministrationback.dao.AdministratorMapper;
import io.hqk.jcartadministrationback.po.Administrator;
import io.hqk.jcartadministrationback.service.AdministratorService;
import org.springframework.stereotype.Service;

@Service
public class AdmininistartServiceImpl implements AdministratorService {

    private AdministratorMapper administratorMapper;

    @Override
    public Administrator getById(Integer administratorId) {
        Administrator administrator = administratorMapper.selectByPrimaryKey(administratorId);
        return administrator;
    }

    @Override
    public Administrator getByUsername(String username) {
        Administrator administrator = administratorMapper.selectByUsername(username);
        return administrator;
    }

    @Override
    public void update(Administrator administrator) {
        administratorMapper.updateByPrimaryKeySelective(administrator);
    }
}
