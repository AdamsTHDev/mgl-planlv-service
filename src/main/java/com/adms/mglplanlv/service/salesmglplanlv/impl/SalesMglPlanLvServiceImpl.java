package com.adms.mglplanlv.service.salesmglplanlv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.mglplanlv.dao.salesmglplanlv.SalesMglPlanLvDao;
import com.adms.mglplanlv.entity.SalesMglPlanLv;
import com.adms.mglplanlv.service.salesmglplanlv.SalesMglPlanLvService;

@Service("salesMglPlanLvService")
@Transactional
public class SalesMglPlanLvServiceImpl implements SalesMglPlanLvService {

	@Autowired
	private SalesMglPlanLvDao salesMglPlanLvDao;
	
	public void setSalesMglPlanLvDao(SalesMglPlanLvDao salesMglPlanLvDao) {
		this.salesMglPlanLvDao = salesMglPlanLvDao;
	}

	@Override
	public List<SalesMglPlanLv> find(SalesMglPlanLv example) throws Exception {
		return salesMglPlanLvDao.find(example);
	}

	@Override
	public List<SalesMglPlanLv> findByHql(String hql, Object... objects) throws Exception {
		return salesMglPlanLvDao.findByHQL(hql, objects);
	}

	@Override
	public SalesMglPlanLv add(SalesMglPlanLv mglTarget, String userLogin) throws Exception {
		return salesMglPlanLvDao.save(mglTarget);
	}

	@Override
	public SalesMglPlanLv update(SalesMglPlanLv mglTarget, String userLogin) throws Exception {
		return salesMglPlanLvDao.save(mglTarget);
	}
	
}
