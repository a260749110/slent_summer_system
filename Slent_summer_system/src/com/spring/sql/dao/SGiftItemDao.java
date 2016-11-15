package com.spring.sql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.sql.domain.SGiftItemPo;

public interface SGiftItemDao extends PagingAndSortingRepository<SGiftItemPo, Integer> {
	  @Query(value = "select * from s_gift_item", nativeQuery = true)
	    List<SGiftItemPo> getAll();

}
