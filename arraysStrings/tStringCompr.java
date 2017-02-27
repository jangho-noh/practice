class StringCompression {
	String stringCompression(String s) {
		// check if returned string will be shorter
		char[] c = s.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();	
		for (char ch : c) {
			if (!hs.contains(c)) hs.add(c);
			else return s;
		
		int count;		
		int i = 0;
		int j;
		StringBuilder sb = new StringBuilder();
		char[] c = s.toCharArray();
		for (; i < c.length; ) {
			sb.append(c[i]);
			count = 1;
			j = i + 1;
			for (; j < c.length(); j++) {
				if (c[j] == c[i]) count++;
				else {
					sb.append(count);
					i = j;
				}
			}
		}
		return sb.toString();
	}
}
