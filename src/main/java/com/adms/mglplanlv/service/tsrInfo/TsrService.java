package com.adms.mglplanlv.service.tsrInfo;

import java.util.List;

import com.adms.mglplanlv.entity.Tsr;

public interface TsrService {

	public List<Tsr> find(Tsr example) throws Exception;
	public List<Tsr> findByHql(String hql, Object...objects) throws Exception;
	
}
