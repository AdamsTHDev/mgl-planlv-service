package com.adms.mglplanlv.service.planlv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.mglplanlv.dao.planlv.PlanLvValueDao;
import com.adms.mglplanlv.entity.PlanLvValue;
import com.adms.mglplanlv.service.planlv.PlanLvValueService;

@Service("planLvValueService")
@Transactional
public class PlanLvValueServiceImpl implements PlanLvValueService {

	@Autowired
	private PlanLvValueDao planLvValueDao;

	public void setPlanLvValueDao(PlanLvValueDao planLvValueDao) {
		this.planLvValueDao = planLvValueDao;
	}

	@Override
	public List<PlanLvValue> findPlanLvValueAll() throws Exception {
		return planLvValueDao.findAll();
	}

	@Override
	public PlanLvValue findPlanLvValueById(Long id) throws Exception {
		return planLvValueDao.find(id);
	}

	@Override
	public List<PlanLvValue> findByHql(String hql, Object... params) throws Exception {
		return planLvValueDao.findByHQL(hql, params);
	}
	
	@Override
	public List<PlanLvValue> findByNamedQuery(String queryName, Object... params) throws Exception {
		return planLvValueDao.findByNamedQuery(queryName, params);
	}

}
