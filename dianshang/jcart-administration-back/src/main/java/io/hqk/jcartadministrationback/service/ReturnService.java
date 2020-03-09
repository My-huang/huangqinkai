package io.hqk.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.hqk.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.hqk.jcartadministrationback.po.Return;

public interface ReturnService {


    Page<Return>  searc(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);


}
