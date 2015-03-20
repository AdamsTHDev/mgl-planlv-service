package com.adms.mglplanlv.service.productionbylot;

import java.util.Date;
import java.util.List;

import com.adms.mglplanlv.entity.ProductionByLot;

public interface ProductionByLotService {

	public List<ProductionByLot> find(ProductionByLot example) throws Exception;
	public List<ProductionByLot> findByHql(String hql, Object...objects) throws Exception;
	public ProductionByLot findProductionByLotByListLotCodeAndProductionDate(String listLotCode, Date productionDate) throws Exception;
	public ProductionByLot addProductionByLot(ProductionByLot productionByLot, String batchId) throws Exception;
	public ProductionByLot updateProductionByLot(ProductionByLot productionByLot, String batchId) throws Exception;
	public List<ProductionByLot> findByNamedQuery(String queryName, Object...values) throws Exception;
	
}
