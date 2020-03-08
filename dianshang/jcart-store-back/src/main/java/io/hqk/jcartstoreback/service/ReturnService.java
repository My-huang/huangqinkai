package io.hqk.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.hqk.jcartstoreback.po.Return;

public interface ReturnService {

    Integer cueate(Return aReturn);



    Page<Return> getPageCustOmId(Integer customerId,Integer pageNum);

    Return getByid(Integer returnid);

}
