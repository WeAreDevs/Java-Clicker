package com.wearedevs.javaclicker.shop.items.bombs.nukes;

import com.wearedevs.javaclicker.handlers.AutoHandler;
import com.wearedevs.javaclicker.handlers.ShopHandler;
import com.wearedevs.javaclicker.shop.ShopItem;
import com.wearedevs.javaclicker.shop.items.portal.Portal1;

public class Nuke1 extends ShopItem {

	public void onPurchase() {
		AutoHandler.clickBomb = 1000;
		
		ShopHandler.unlock(new Portal1());
	}

	public int getPrice() {
		return 20000;
	}

	public String getName() {
		return "Click Nuke: Tier 1";
	}

}