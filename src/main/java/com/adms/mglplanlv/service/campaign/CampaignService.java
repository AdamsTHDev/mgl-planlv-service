package com.adms.mglplanlv.service.campaign;

import java.util.List;

import com.adms.mglplanlv.entity.Campaign;

public interface CampaignService {

	public List<Campaign> find(Campaign example) throws Exception;
	public List<Campaign> findByHql(String hql, Object...objects) throws Exception;
	public List<Campaign> findCampaignByLikeListLot(String listLot) throws Exception;
	
}
