To add code to the game loop, add a new class that extends `TickHook` (`com.wearedevs.someclicker.mod.TickHook`). In the `run` method, add the code you want to run per tick. When you want to disable the hook, call `this.disable()`. To add the hook, just create a new instance of it.

```java
import com.wearedevs.someclicker.mod.TickHook;

public class MyHook extends TickHook {
	public void run() {
		
	}
	
}
```
