package net.TheDgtl.Stargate.event;

import org.bukkit.event.CustomEventListener;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;

public class StargateListener extends CustomEventListener implements Listener {
	public StargateListener() {
		
	}
	
	public void onStargateOpen(StargateOpenEvent event) {
		
	}
	
	public void onStargateClose(StargateCloseEvent event) {
		
	}
	
	@Override
	public void onCustomEvent(Event event) {
		if (event instanceof StargateOpenEvent) {
			onStargateOpen((StargateOpenEvent)event);
		} else if (event instanceof StargateCloseEvent) {
			onStargateClose((StargateCloseEvent)event);
		}
	}
}
