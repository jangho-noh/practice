class PalinPerm {
	boolean palinPerm(String s) {
>();
		int[] counts = new int[256];
		int odds = 0;
		for (char c : s) {
			counts[c]++;
		}
		for (int i : counts) {
			if (i % 2 != 0)
				odds++;
		}
		if (odds > 1) return false;
		return true;
	}
}
				
