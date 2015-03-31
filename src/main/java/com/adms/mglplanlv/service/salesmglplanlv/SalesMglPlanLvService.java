package com.adms.mglplanlv.service.salesmglplanlv;

import java.util.List;

import com.adms.mglplanlv.entity.SalesMglPlanLv;

public interface SalesMglPlanLvService {

	public List<SalesMglPlanLv> find(SalesMglPlanLv example) throws Exception;
	public List<SalesMglPlanLv> findByHql(String hql, Object...objects) throws Exception;
	public SalesMglPlanLv add(SalesMglPlanLv mglTarget, String userLogin) throws Exception;
	public SalesMglPlanLv update(SalesMglPlanLv mglTarget, String userLogin) throws Exception;
}
