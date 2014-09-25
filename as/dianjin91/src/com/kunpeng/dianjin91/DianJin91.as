package com.kunpeng.dianjin91
{
	import flash.events.Event;
	import flash.events.EventDispatcher;
	import flash.events.StatusEvent;
	import flash.external.ExtensionContext;

	public class DianJin91 extends EventDispatcher
	{
		protected var extensionContext:ExtensionContext = null;
		private var appID:int;
		private var appKey:String;
		private var appChannel:int;
		
	
		
		public function DianJin91()
		{
			this.init();
		}
		
		private function init() : void
		{
			var _loc_1:String = "com.kunpeng.dianjin91.DianJin91Extension";
			this.extensionContext = ExtensionContext.createExtensionContext(_loc_1, "");
			if (this.extensionContext == null)
			{
				trace("无法创建DianJin91Extension");
			}else{
				this.extensionContext.addEventListener(StatusEvent.STATUS, onStatus);
			}
			return;
		}
		
		protected function onStatus(event:StatusEvent):void
		{
			var e:DianJinEvent = new DianJinEvent(event.code);
			e.data = event.level;
			this.dispatchEvent(e);
		}
		
		private static var _instance:DianJin91;
		public static function get instance():DianJin91
		{
			if (_instance == null)
				_instance = new DianJin91();
			return _instance;
		}
		
		public function get supportDevice() : Boolean
		{
			return this.extensionContext != null;
		}// end function
		
		public function setKeys(appID:int, key:String, channel:int=1001) : void
		{
			this.appID = appID;
			this.appKey = key;
			this.appChannel = channel;
			if (this.extensionContext)
				this.extensionContext.call("dianJinInit",appID,key,channel);
			return;
		}// end function
		
		public function showInterstitial() : void
		{
			if (this.extensionContext)
				this.extensionContext.call("dianJinShowInterstitial");
			return;
		}// end function
	}
}