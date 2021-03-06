package com.mydeblob.warning;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class StopTask extends BukkitRunnable{
	
	private int counter;
	private int amount;

	public StopTask(int counter){
		this.counter = counter;
		this.amount = this.counter;
	}

	public void run() {
		if(counter > 0){
			if(counter == amount){
				ReloadWarning.sendMessage("&7[&4Warning&7] &cThe server is going to stop in &4" + counter + " &cseconds!");
			}else if(counter == 10){
				ReloadWarning.sendMessage("&7[&4Warning&7] &cThe server is going to stop in &4" + counter + " &cseconds!");
			}else if(counter <= 5){
				ReloadWarning.sendMessage("&7[&4Warning&7] &cThe server is going to stop in &4" + counter + " &cseconds!");
			}
			counter--;
		}else{
			Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "stop");
			this.cancel();
		}

	}
}
