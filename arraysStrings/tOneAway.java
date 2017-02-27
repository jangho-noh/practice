class OneAway {
	boolean oneAway(String s, String t) {
		int i = 0;
		int j = 0;
		int diffs = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) != t.charAt(j) && s.length() > t.length()) {
				diffs++;
				i++;
			}
			else if (s.charAt(i) != t.charAt(j) && s.length() < t.length()) {
				diffs++;
				j++;
			} 				
			else if (s.charAt(i) != t.charAt(j)) {
				diffs++;
			}
			else {
				i++;
				j++;
			}
		}
		if (diffs > 1) return false;
		return true;
	}
}
