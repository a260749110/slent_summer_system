package com.spring.sql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.sql.domain.TMenuLinePo;

public interface TMenuLineDao extends CrudRepository<TMenuLinePo, Integer> {
	@Query(value = "select * from t_menu_line", nativeQuery = true)
	List<TMenuLinePo> getAll();
}