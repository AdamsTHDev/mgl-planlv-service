package com.adms.mglplanlv.service.mgltarget;

import java.util.List;

import com.adms.mglplanlv.entity.MglTarget;

public interface MglTargetService {

	public List<MglTarget> find(MglTarget example) throws Exception;
	public List<MglTarget> findByHql(String hql, Object...objects) throws Exception;
	public MglTarget add(MglTarget mglTarget, String userLogin) throws Exception;
}
