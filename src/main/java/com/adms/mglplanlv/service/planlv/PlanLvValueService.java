package com.adms.mglplanlv.service.planlv;

import java.util.List;

import com.adms.mglplanlv.entity.PlanLvValue;

public interface PlanLvValueService {

	public List<PlanLvValue> findPlanLvValueAll() throws Exception;

	public PlanLvValue findPlanLvValueById(Long id) throws Exception;

	public List<PlanLvValue> findByHql(String hql, Object...params) throws Exception;

	public List<PlanLvValue> findByNamedQuery(String queryName, Object... params) throws Exception;
}
