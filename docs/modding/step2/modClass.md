To make a mod, create a class extending `Mod` (`com.wearedevs.someclicker.mod.Mod`). In the constructor of your new class will contain all the code that is run (Registering Handlers and Shop Items).

```java
package com.imdaveead.someclicker.examplemod;

import com.wearedevs.someclicker.mod.Mod;

public class MyNewMod extends Mod {
	public MyNewMod() {
		//Code To Run When Mod is Loaded.
	}

	public void preInit() {
		//Code to Run Before Loading the Save File.
	}

	public void postInit() {
		//Code to Run After Loading the Save File.
	}
	
	public String[] save() {
		//Save Your Mod Stuff.
		return null;
	}
	
	public void load(String[] savefile) {
		//Load Your Mod Stuff.
	}
}
```
