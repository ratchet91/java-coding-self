package test123;

public class Test1234 {

	public static void main(String[] args) {

		String data = "a,b,c e,f,g i,j,k m,n,o q,r,s";

		calculations(data);

		// i/P -> [a,b,c]
		// i/P -> [e,f,g]
		// i/P -> [i,j,k]
		// i/P -> [m,n,o]
		// i/P -> [q,r,s]

//			output:
//			[[a, e, i, m, q], 
//			 [b, f, j, n, r], 
//			 [c, g, k, o, s]]

	}

	public static void calculations(String data) {
		String[] str = data.split(" ");
		int n = str.length;
		int m = (int) Math.floor(str[0].length() / 2) + 1;
		System.out.println("length m:" + m);
		System.out.println("length n:" + n);
		String[][] strArray = new String[n][m];
		for (int i = 0; i < n; i++) {
			String[] s = str[i].split(",");
			for (int j = 0; j < s.length; j++) {
				strArray[i][j] = s[j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(strArray[i][j] + " ");

			}
			System.out.println();
		}

		String[][] strRes = new String[3][5];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				strRes[j][i] = strArray[i][j];
				System.out.println("solution" + strRes[j][i]);

			}
		}
		System.out.println("solution");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(strRes[i][j] + " ");

			}
			System.out.println();
		}

		/*
		 * for (int i = 0; i < m; i++) { for (int j = 0; j < n; j++) { strRes[j][i] =
		 * strArray[i][j];
		 * 
		 * } // System.out.println(Arrays.toString(strRes[i])); }
		 */

	}

}
