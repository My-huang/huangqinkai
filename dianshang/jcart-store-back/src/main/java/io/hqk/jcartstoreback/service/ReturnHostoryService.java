package io.hqk.jcartstoreback.service;

import io.hqk.jcartstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHostoryService {


    List<ReturnHistory> getByreturnID(Integer returnId);
}
