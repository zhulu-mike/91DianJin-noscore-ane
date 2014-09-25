package com.kunpeng.dianjin91
{
	import flash.events.Event;
	
	public class DianJinEvent extends Event
	{
		
		public static const DOWN_SUCCESS:String = "DownSuccess";
		
		public function DianJinEvent(type:String, bubbles:Boolean=false, cancelable:Boolean=false)
		{
			super(type, bubbles, cancelable);
		}
		
		public var data:*;
	}
}