import java.util.Stack;

public class ToastTest {
	public static int[] getNextGreatestElement(int[] arr, int size) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[size];
		int n = 2 * size;
		for (int i = n; i >= 0; i--) {

			while (!st.isEmpty() && st.peek() <= arr[i % size]) {
				st.pop();
			}
			if (i < size) {
				if (!st.isEmpty()) {
					ans[i] = st.peek();
				} else {
					ans[i] = -1;
				}
			}
			st.push(arr[i % size]);

		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 45, 7, 2, 5, 7, 12 };
		int[] ans1 = getNextGreatestElement(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(ans1[i]);
		}

	}

}
