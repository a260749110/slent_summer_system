package com.spring.sql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring.sql.domain.SPrizeDrawItemPo;

public interface SPrizeDrawItemDao extends CrudRepository<SPrizeDrawItemPo, Integer> {
    @Query(value = "select * from s_prize_draw_item where enable>0", nativeQuery = true)
    List<SPrizeDrawItemPo> getAll();
}
