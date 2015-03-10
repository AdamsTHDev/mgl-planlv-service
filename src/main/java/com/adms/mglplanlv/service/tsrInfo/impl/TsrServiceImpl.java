package com.adms.mglplanlv.service.tsrInfo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.mglplanlv.dao.tsrinfo.TsrDao;
import com.adms.mglplanlv.entity.Tsr;
import com.adms.mglplanlv.service.tsrInfo.TsrService;

@Service("tsrService")
@Transactional
public class TsrServiceImpl implements TsrService {

	@Autowired
	private TsrDao tsrInfoDao;
	
	public void setTsrInfoDao(TsrDao tsrInfoDao) {
		this.tsrInfoDao = tsrInfoDao;
	}
	
	@Override
	public List<Tsr> find(Tsr example) throws Exception {
		return tsrInfoDao.find(example);
	}

	@Override
	public List<Tsr> findByHql(String hql, Object... objects) throws Exception {
		return tsrInfoDao.findByHQL(hql, objects);
	}

}
