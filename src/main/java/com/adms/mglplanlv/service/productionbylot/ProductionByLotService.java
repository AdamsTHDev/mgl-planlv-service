package com.adms.mglplanlv.service.productionbylot;

import java.util.List;

import com.adms.mglplanlv.entity.ProductionByLot;

public interface ProductionByLotService {

	public List<ProductionByLot> find(ProductionByLot example) throws Exception;
	public List<ProductionByLot> findByHql(String hql, Object...objects) throws Exception;
	
}
