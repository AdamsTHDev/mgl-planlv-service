package com.adms.mglplanlv.service.mgltarget.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.mglplanlv.dao.mgltarget.TempKeyCodeInPastDao;
import com.adms.mglplanlv.entity.TempKeyCodeInPast;
import com.adms.mglplanlv.service.mgltarget.TempKeyCodeInPastService;

@Service("tempKeyCodeInPastService")
@Transactional
public class TempKeyCodeInPastServiceImpl implements TempKeyCodeInPastService {

	@Autowired
	private TempKeyCodeInPastDao mglTargetDao;
	
	public void setTsrInfoDao(TempKeyCodeInPastDao mglTargetDao) {
		this.mglTargetDao = mglTargetDao;
	}
	
	@Override
	public List<TempKeyCodeInPast> find(TempKeyCodeInPast example) throws Exception {
		return mglTargetDao.find(example);
	}

	@Override
	public List<TempKeyCodeInPast> findByHql(String hql, Object... objects) throws Exception {
		return mglTargetDao.findByHQL(hql, objects);
	}

	@Override
	public TempKeyCodeInPast add(TempKeyCodeInPast mglTarget, String userLogin) throws Exception {
		return mglTargetDao.save(mglTarget);
	}

	
}
