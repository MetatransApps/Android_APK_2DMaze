package com.maze_squirrel.app;


import org.metatrans.commons.ads.api.IAdsConfigurations;
import org.metatrans.commons.cfg.appstore.IAppStore;

import com.maze_squirrel.cfg.ads.AdsConfigurations_MOS;


public class Application_Maze_AllAds extends Application_Maze {


	protected IAdsConfigurations adsConfigurations = new AdsConfigurations_MOS(this);

	
	@Override
	public IAdsConfigurations getAdsConfigurations() {
		return adsConfigurations;
	}


	@Override
	public IAppStore getAppStore() {
		return IAppStore.OBJ_GOOGLE;
	}
}
