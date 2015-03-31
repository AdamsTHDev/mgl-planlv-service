package com.adms.mglplanlv.service.mgltarget;

import java.util.List;

import com.adms.mglplanlv.entity.TempKeyCodeInPast;

public interface TempKeyCodeInPastService {

	public List<TempKeyCodeInPast> find(TempKeyCodeInPast example) throws Exception;
	public List<TempKeyCodeInPast> findByHql(String hql, Object...objects) throws Exception;
	public TempKeyCodeInPast add(TempKeyCodeInPast mglTarget, String userLogin) throws Exception;
}
