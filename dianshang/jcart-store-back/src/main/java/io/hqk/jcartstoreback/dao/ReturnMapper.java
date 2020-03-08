package io.hqk.jcartstoreback.dao;

import com.github.pagehelper.Page;
import io.hqk.jcartstoreback.po.Return;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);


    Page<Return> selectPageByCutomerID(@Param("customerId") Integer customerId);

}