package com.wearedevs.javaclicker.cases.cases;

import com.wearedevs.javaclicker.cases.Case;
import com.wearedevs.javaclicker.cases.CaseOutcome;
import com.wearedevs.javaclicker.util.WeightedCollection;

public class ClickCase extends Case {

	public WeightedCollection<CaseOutcome> getAllOutcomes() {
		WeightedCollection<CaseOutcome> out = new WeightedCollection<CaseOutcome>();
		
		//Bomb
		out.add(60, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "500 Clicks";
			}
		});
		
		//Rainbow
		out.add(30, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "1000 Clicks";
			}
		});
		
		//Airhorn
		out.add(10, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "5000 Clicks";
			}
		});
		
		//Fart
		out.add(20, new CaseOutcome() {
			public void onOutcome() {
				//If it gets chosen
			}
			public String getName() {
				return "Click Case";
			}
		});
		
		return out;
	}

	public String getName() {
		return "Sound Case";
	}

}
