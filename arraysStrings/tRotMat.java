class RotateMatrix {
	int[][] rotate(int[][] m) {
		int[][] m2 = int[m.length][m[0].length];
		for (int i = 0, i2 = m.length-1; i < m.length; i++, i2--) {
			for (int j = 0, j2 = m.length-1; j < m.length; j++, j2--) {	
				m2[i][j] = m[i2][j2];
			}
		}
		// for in-place solution, probably do a swap
		return m2;
	}
}
