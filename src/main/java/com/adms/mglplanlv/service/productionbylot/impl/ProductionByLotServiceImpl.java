package com.adms.mglplanlv.service.productionbylot.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.mglplanlv.dao.productionbylot.ProductionByLotDao;
import com.adms.mglplanlv.entity.ProductionByLot;
import com.adms.mglplanlv.service.productionbylot.ProductionByLotService;

@Service("productionByLotService")
@Transactional
public class ProductionByLotServiceImpl implements ProductionByLotService {

	@Autowired
	private ProductionByLotDao productionByLotDao;
	
	public void setProductionByLotDao(ProductionByLotDao productionByLotDao) {
		this.productionByLotDao = productionByLotDao;
	}

	@Override
	public List<ProductionByLot> find(ProductionByLot example) throws Exception {
		return productionByLotDao.find(example);
	}

	@Override
	public List<ProductionByLot> findByHql(String hql, Object... objects) throws Exception {
		return productionByLotDao.findByHQL(hql, objects);
	}

}
