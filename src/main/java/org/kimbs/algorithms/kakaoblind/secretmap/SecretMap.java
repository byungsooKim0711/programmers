package org.kimbs.algorithms.kakaoblind.secretmap;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			// 비트연산 OR 사용.
			answer[i] = "" + Integer.toBinaryString((arr1[i] | arr2[i])).replaceAll("0", " ").replaceAll("1", "#");
			if (answer[i].length() != n) {
				int len = answer[i].length();
				for (int idx = 0; idx < n - len; idx++) {
					answer[i] = " " + answer[i];
				}
			}
		}

		return answer;
	}
}