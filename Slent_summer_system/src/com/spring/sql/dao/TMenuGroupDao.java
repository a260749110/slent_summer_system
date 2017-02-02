package com.spring.sql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.sql.domain.TMenuGroupPo;

public interface TMenuGroupDao extends CrudRepository<TMenuGroupPo, Integer> {
	@Query(value = "select * from t_menu_group", nativeQuery = true)
	List<TMenuGroupPo> getAll();
}
