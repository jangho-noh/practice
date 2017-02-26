// replace all spaces in string with '%20'. 
// Assume string has sufficent space
// have 2 pointers i, j
// i is at the end of the character arry
// j is at the last character
// iterate backwards through j
// for each, copy to i (and decrement it)

class URLify {
	static String urlify(char[] s) {
		int i = s.length;
		int j;
		for (j = i; j >= 0; j--) {
			if(s[j] != ' ') break;
		}

		while (j >= 0) {
			if(s[j] == ' ') {
				s[i--] = '0';
				s[i--] = '2';
				s[i--] = '%';
				j--;
			}
			else {
				s[i--] = s[j--];	
			}
		}
		return s.toString();
	}
}
