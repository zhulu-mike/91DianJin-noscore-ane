package com.kunpeng.dianjin91.extension;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.kunpeng.dianjin91.func.DianJinShowOfferWall;
import com.kunpeng.dianjin91.func.InitDianJin;

public class DianJin91Context extends FREContext {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		// TODO Auto-generated method stub
		Map<String, FREFunction> functionMap = new HashMap<String, FREFunction>();
	    functionMap.put("dianJinShowInterstitial", new DianJinShowOfferWall());

	    functionMap.put("dianJinInit", new InitDianJin());
	    return functionMap;
	}

}
