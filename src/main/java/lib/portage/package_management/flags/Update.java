package lib.portage.package_management.flags;

import lib.portage.interfaces.FlagFeature;
import lib.portage.package_management.EmergePackage;

public class Update implements FlagFeature {
	
	@Override
	public int flagId() {
		return 0;
	}

	@Override
	public boolean deployFlag(EmergePackage packag) {
		System.out.println("i be updating");
		return true;
	}

}
