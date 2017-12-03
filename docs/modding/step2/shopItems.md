To create a shop item, make a new class that extends `ShopItem` (`com.wearedevs.someclicker.shop.ShopItem`).

```java
import com.wearedevs.someclicker.shop.ShopItem;

public class MyShopItem extends ShopItem {
	public void onPurchase() {
		//Run Code
	}

	public int getPrice() {
		return 100;
	}

	public String getName() {
		return "My Custom Item";
	}
}
```
Use `getPrice()` and `getName()` to return the price and name of the item. `onPurchase()` is called when the user successfully buys your item.

To add the item to the shop call `ShopHander.unlock(ShopItem item)` with your item. You can make shop item unlock trees by calling `ShopHander.unlock` after purchasing an item.
