class StringRotation {
	boolean isRotation(String s1, String s2) {
		// use one call to isSubstring
		// concatenate one or the other
		StringBuilder sb = new StringBuilder();
		sb.append(s1); sb.append(s1);
		String concatStr = sb.toString();
		return isSubstring(concatStr, s2);
	}
}
		
		
