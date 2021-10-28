package com.maze_squirrel.app;


import org.metatrans.commons.ads.api.IAdsConfigurations;
import org.metatrans.commons.cfg.appstore.IAppStore;

import com.maze_squirrel.cfg.ads.AdsConfigurations_MOS;


public class Application_Maze_AllAds extends Application_Maze {


	@Override
	public IAppStore getAppStore() {
		return IAppStore.OBJ_FDROID_OFFICIAL;
	}


	protected IAdsConfigurations adsConfigurations = new AdsConfigurations_MOS(this);

	
	@Override
	public IAdsConfigurations getAdsConfigurations() {
		return adsConfigurations;
	}
}
