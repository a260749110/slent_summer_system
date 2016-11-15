package com.spring.sql.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.spring.sql.domain.SVipGiftPo;

public interface SVipGiftDao extends CrudRepository<SVipGiftPo, Integer> {
	  @Query(value = "select * from s_vip_gift where vip_id=:vip_id", nativeQuery = true)
	  public List<SVipGiftPo> findByVipId(@Param("vip_id")Long vip_id);
	  
	  
	  	
		@Modifying
		@Transactional
		@Query(value = "DELETE FROM s_vip_gift WHERE end_date<now()", nativeQuery = true)
	  void removeByTime();
}
