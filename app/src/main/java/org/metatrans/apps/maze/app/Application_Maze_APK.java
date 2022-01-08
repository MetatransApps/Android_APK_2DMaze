package org.metatrans.apps.maze.app;


import org.metatrans.apps.maze.cfg.ads.AdsConfigurations_MOS;
import org.metatrans.commons.ads.api.IAdsConfigurations;
import org.metatrans.commons.cfg.appstore.IAppStore;


public class Application_Maze_APK extends Application_Maze {


	protected IAdsConfigurations adsConfigurations;


	@Override
	public IAppStore getAppStore() {
		return IAppStore.OBJ_FDROID_OFFICIAL;
	}


	@Override
	public void onCreate() {

		super.onCreate();

		adsConfigurations = new AdsConfigurations_MOS(this);

	}
	
	
	@Override
	public IAdsConfigurations getAdsConfigurations() {
		return adsConfigurations;
	}
}
