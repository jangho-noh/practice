// to be completed
class ZeroMatrix {
	boolean[][] b = new boolean[m.length][m[0].length];
	int[][] zeroMatrix(int[][] m) {
		
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] == 0) 
					b[i][j] = true;
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (b[i][j] == true)
					zeroOut(m, i, j);
			}
		}
	static void zeroOut(int[][] m, int a, int b) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (a == i || b == j)
					m[i][j] == 0; 
			}
		}
	}
}
