package com.spring.service.dtoservice;

import java.util.ArrayList;
import java.util.List;

import com.spring.service.impl.SqlService;
import com.spring.sql.dao.ActivityDao;
import com.spring.sql.domain.TActivityPo;
import com.spring.sql.dto.ActivityDto;

public class DtoService {

	public static DtoService instance = new DtoService();

	private ActivityDao activityDao;

	private DtoService() {
		activityDao = SqlService.getBean(ActivityDao.class);
	}

	public List<ActivityDto> getAllActity() {
		List<ActivityDto> result = new ArrayList<>();
		List<TActivityPo> pos = activityDao.getAll();
		pos.forEach(a -> {
			result.add(ActivityDto.formPo(a));
		});

		return result;

	}

	public void saveActivity(ActivityDto dto) {
		activityDao.save(ActivityDto.toPo(dto));
	}
}
