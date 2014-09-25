package com.kunpeng.dianjin91.extension;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
import com.bodong.dianjinweb.DianJinPlatform;

public class DianJin91Extension implements FREExtension {

	
	public static DianJin91Context context;
	@Override
	public FREContext createContext(String arg0) {
		// TODO Auto-generated method stub
		context = new DianJin91Context();
		return context;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		DianJinPlatform.destory(context.getActivity());
		context.dispose();
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

}
