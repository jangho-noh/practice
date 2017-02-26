class IsUnique {

	static boolean uniqCh2(String s)
	{
		char[] sCh = s.toCharArray();
		boolean[] b = new boolean[256];	// enough for UTF-8
		for ( int i = 0; i < sCh.length; i++ )
		{
			if ( b[sCh[i]] == false )
				b[sCh[i]] = true;
			else
				return false;
		}
		return true;
	}
	
	// with Hash
	static boolean uniqCh(String s)
	{
		Hashtable<Character, Integer> map = new Hashtable<Character, Integer>();
		char[] sCh = s.toCharArray();
		for ( char ch : sCh )
		{
			if (map.get(ch) == null)
				map.put(ch, 1);
			else
				return false;
		}
		return true;
	}
}
