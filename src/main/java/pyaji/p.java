package pyaji;

public class p {
	public static int[] range(int s, int e) {
		int[] ret = new int[(e - s)];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = s + i;
		}
		return ret;
	}

	public static int[] range(int n) {
		return range(0, n);
	}

	public static void print(Object o) {
		System.out.println(o);
	}
}
