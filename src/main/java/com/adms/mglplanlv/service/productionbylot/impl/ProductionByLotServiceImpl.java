package com.adms.mglplanlv.service.productionbylot.impl;

import java.util.Date;
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
	
	@Override
	public List<ProductionByLot> findByNamedQuery(String queryName, Object...values) throws Exception {
		return productionByLotDao.findByNamedQuery(queryName, values);
	}

	@Override
	public ProductionByLot findProductionByLotByListLotCodeAndProductionDate(String listLotCode, Date productionDate) throws Exception
	{
		List<ProductionByLot> productionByLotList = this.productionByLotDao.findByNamedQuery("findProductionByLotByListLotCodeAndProductionDate", listLotCode, productionDate);

		return productionByLotList.size() == 1 ? productionByLotList.get(0) : null;
	}
	
	@Override
	public ProductionByLot addProductionByLot(ProductionByLot productionByLot, String batchId)
			throws Exception
	{
		return this.productionByLotDao.save(productionByLot);
	}
	
	@Override
	public ProductionByLot updateProductionByLot(ProductionByLot productionByLot, String batchId)
			throws Exception
	{
		return this.productionByLotDao.save(productionByLot);
	}
}
