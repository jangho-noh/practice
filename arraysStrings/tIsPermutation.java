public class IsPermutation {

	// can use either the 2 hashtables or 2 boolean arrays
	// and see if equal
	static boolean isPermute(String s1, String s2)
	{
		if ( s1.length() != s2.length() )
			return false;
		char[] sCh1 = s1.toCharArray(), sCh2 = s2.toCharArray();
		boolean[] b1 = new boolean[256], b2 = new boolean[256];
		
		for ( int i = 0; i < sCh1.length; i++ )
		{
			if ( b1[sCh1[i]] == false )
			{
				b1[sCh1[i]] = true;
			}
			if ( b2[sCh2[i]] == false )
			{
				b2[sCh2[i]] = true;
			}
		}
		for ( int j = 0; j < b1.length; j++ )
		{
			if ( b1[j] != b2[j])
				return false;
		}
		return true;
	}
}
