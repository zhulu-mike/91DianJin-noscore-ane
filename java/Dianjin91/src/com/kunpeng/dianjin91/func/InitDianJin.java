package com.kunpeng.dianjin91.func;

import android.widget.Toast;

import com.adobe.fre.FREObject;
import com.bodong.dianjinweb.DianJinPlatform;
import com.bodong.dianjinweb.listener.AppActiveListener;
import com.kunpeng.dianjin91.extension.DianJin91Context;
import com.kunpeng.dianjin91.extension.DianJin91Extension;

public class InitDianJin extends KunPengFunc {

	public static DianJin91Context contextAct;
	 protected FREObject doCall(DianJin91Context ctx, FREObject[] ps)
	  {
		 contextAct = ctx;
	    super.doCall(ctx, ps);
	    
	    int id = getInt(ps, 0);
	    String key = getString(ps, 1);
	    int channel = getInt(ps, 2);
	    DianJinPlatform.initialize(ctx.getActivity(), id, key, channel);
	    return null;
	  }
}
