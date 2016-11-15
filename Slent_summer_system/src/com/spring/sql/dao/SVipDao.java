package com.spring.sql.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.sql.domain.SVipPo;

public interface SVipDao extends CrudRepository<SVipPo, String>  {


}
