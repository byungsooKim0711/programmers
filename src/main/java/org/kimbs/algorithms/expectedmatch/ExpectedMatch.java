package org.kimbs.algorithms.expectedmatch;

public class ExpectedMatch {
    public int solution(int n, int a, int b) {
		int answer = 0;
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

		int tmp = n;

		int start = 1;
		int end = n;

		for (int i = tmp; tmp > 1; i++) {
			tmp /= 2;
			answer++;
		}

		do {
			double div = (start + end) / 2.0;
			if (a < div && b > div) {
				return answer;
			} else {
				answer--;
				if (div < a && div < b) {
					start = (int) (div + 0.5);
				}
				if (div > a && div > b) {
					end = (int) (div - 0.5);
				}
			}
			
		} while (answer > 1);

		return answer;
	}
}