package com.adms.mglplanlv.service.campaign.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adms.mglplanlv.dao.campaign.CampaignDao;
import com.adms.mglplanlv.entity.Campaign;
import com.adms.mglplanlv.service.campaign.CampaignService;

@Service("campaignService")
@Transactional
public class CampaignServiceImpl implements CampaignService {

	@Autowired
	private CampaignDao campaignDao;
	
	public void setTsrInfoDao(CampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}
	
	@Override
	public List<Campaign> find(Campaign example) throws Exception {
		return campaignDao.find(example);
	}

	@Override
	public List<Campaign> findByHql(String hql, Object... objects) throws Exception {
		return campaignDao.findByHQL(hql, objects);
	}

}
