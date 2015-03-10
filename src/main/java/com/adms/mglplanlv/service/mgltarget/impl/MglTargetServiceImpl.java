package com.adms.mglplanlv.service.mgltarget.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.mglplanlv.dao.mgltarget.MglTargetDao;
import com.adms.mglplanlv.entity.MglTarget;
import com.adms.mglplanlv.service.mgltarget.MglTargetService;

@Service("mglTargetService")
@Transactional
public class MglTargetServiceImpl implements MglTargetService {

	@Autowired
	private MglTargetDao mglTargetDao;
	
	public void setTsrInfoDao(MglTargetDao mglTargetDao) {
		this.mglTargetDao = mglTargetDao;
	}
	
	@Override
	public List<MglTarget> find(MglTarget example) throws Exception {
		return mglTargetDao.find(example);
	}

	@Override
	public List<MglTarget> findByHql(String hql, Object... objects) throws Exception {
		return mglTargetDao.findByHQL(hql, objects);
	}

	@Override
	public MglTarget add(MglTarget mglTarget, String userLogin) throws Exception {
		return mglTargetDao.save(mglTarget);
	}

	
}
