package com.kunpeng.dianjin91.func;


import com.adobe.fre.FREObject;
import com.bodong.dianjinweb.DianJinPlatform;
import com.kunpeng.dianjin91.extension.DianJin91Context;

public class DianJinShowOfferWall extends KunPengFunc {

	protected FREObject doCall(DianJin91Context ctx, FREObject[] ps)
	  {
	    super.doCall(ctx, ps);
	    DianJinPlatform.showOfferWall(ctx.getActivity());
	    return null;
	  }
}
