package homeassignment.Day2;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int n = 7, firstTerm = 0, secondTerm = 1;
		for (int i = 0; i <=n; ++i) {
			System.out.println(firstTerm + ",");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
