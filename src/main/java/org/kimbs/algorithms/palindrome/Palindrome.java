package org.kimbs.algorithms.palindrome;

public class Palindrome {
    public int solution(String s) {

		int slide = s.length();

		while (slide > 0) {

			for (int i = 0; i <= s.length()-slide; i++) {
				if (slide % 2 == 0) { // 슬라이딩 윈도우가 짝수일 경우
					int cnt = 0;
					int tmp = 0;
					for (int right = slide / 2, left = slide / 2 - 1; left >= 0; right++, left--) { 
						tmp++;
						// 가운대를 기준으로 좌측과 우측이 같은가?
						if (s.charAt(right+i) - s.charAt(left+i) != 0) { // 윈도우를 우측으로 1칸씩 이동하기 위해서 +i 를 해준다.
							break;
						} else {
							cnt++;
						}
					}
					if(cnt == tmp) {
						return slide;
					}
				} else { // 슬라이딩 윈도우가 홀수일 경우
					int mid = slide / 2;
					int cnt = 0;
					int tmp = 0;
					for (int right = mid, left = mid; left >= 0; right++, left--) {
						tmp++;
						// 가운대를 기준으로 좌측과 우측이 같은가?
						if (s.charAt(right+i) - s.charAt(left+i) != 0) {// 윈도우를 우측으로 1칸씩 이동하기 위해서 +i 를 해준다.
							break;
						} else {
							cnt++;
						}
					}
					if(cnt == tmp) {
						return slide;
					}
				}
			}
			slide--;
		}
		return slide;
    }
}