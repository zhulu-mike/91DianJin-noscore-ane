package com.kunpeng.dianjin91.func;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;
import com.kunpeng.dianjin91.extension.DianJin91Context;

public class KunPengFunc implements FREFunction {

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {
		// TODO Auto-generated method stub
		try
	    {
	      return doCall((DianJin91Context)arg0, arg1);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
		return null;
	}
	
	protected FREObject doCall(DianJin91Context ctx, FREObject[] ps)
	{
		return null;
	}

	  protected int getInt(FREObject[] ps, int index) 
	  {
		    if ((index < 0) || (index > ps.length - 1)) {
		      return 0;
		    }
		    if (ps[index] == null)
		      return 0;
		    try
		    {
		      return ps[index].getAsInt();
		    }
		    catch (IllegalStateException e) {
		      e.printStackTrace();
		    }
		    catch (FRETypeMismatchException e) {
		      e.printStackTrace();
		    }
		    catch (FREInvalidObjectException e) {
		      e.printStackTrace();
		    }
		    catch (FREWrongThreadException e) {
		      e.printStackTrace();
		    }
		    Log.d("ane", "error getInt");
		    return 0;
		  }

		  protected boolean getBoolean(FREObject[] ps, int index) {
		    if ((index < 0) || (index > ps.length - 1)) {
		      return false;
		    }
		    if (ps[index] == null)
		      return false;
		    try
		    {
		      return ps[index].getAsBool();
		    }
		    catch (IllegalStateException e) {
		      e.printStackTrace();
		    }
		    catch (FRETypeMismatchException e) {
		      e.printStackTrace();
		    }
		    catch (FREInvalidObjectException e) {
		      e.printStackTrace();
		    }
		    catch (FREWrongThreadException e) {
		      e.printStackTrace();
		    }
		    Log.d("ane", "error getBoolean");
		    return false;
		  }

		  protected String getString(FREObject[] ps, int index) {
		    if ((index < 0) || (index > ps.length - 1)) {
		      return null;
		    }
		    if (ps[index] == null)
		      return null;
		    try
		    {
		      return ps[index].getAsString();
		    }
		    catch (IllegalStateException e) {
		      e.printStackTrace();
		    }
		    catch (FRETypeMismatchException e) {
		      e.printStackTrace();
		    }
		    catch (FREInvalidObjectException e) {
		      e.printStackTrace();
		    }
		    catch (FREWrongThreadException e) {
		      e.printStackTrace();
		    }
		    Log.d("ane", "error getString");
		    return null;
		  }

}
