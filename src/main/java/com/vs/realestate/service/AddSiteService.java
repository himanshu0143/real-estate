package com.vs.realestate.service;

import java.util.List;

import com.vs.realestate.entity.AddSite;

public interface AddSiteService {

	public void saveSite(AddSite addSite);

	public List<AddSite> getSites();
}
