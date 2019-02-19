package org.kimbs.algorithms.kakaoblind.cache;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    class Node {
		private String cityName;
		private int refCount = 0;

		public Node(String cityName, int refCount) {
			this.cityName = cityName;
			this.refCount = refCount;
		}

		@Override
		public String toString() {
			return "Node [cityName=" + cityName + ", refCount=" + refCount + "]";
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public int getRefCount() {
			return refCount;
		}

		public void setRefCount(int refCount) {
			this.refCount = refCount;
		}

		public void incrementRefCnt() {
			this.refCount++;
		}
	}

	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		List<Node> list = new ArrayList<Node>();

		boolean hit = false;
		// cacheSize가 0이면, 전부 cache miss 이므로 cities * 5
		if (cacheSize <= 0) {
			answer = answer + 5 * cities.length;
			return answer;
		} else {
            
			for (int i = 0; i < cities.length; i++) {
                int maxRefCnt = -1;
                int maxIndex = -1;
				for (int j = 0; j < list.size() && j < cacheSize; j++) {
					if (list.get(j).getCityName().equalsIgnoreCase(cities[i])) {
						list.get(j).setRefCount(0);
						hit = true;
					} else {
						list.get(j).incrementRefCnt();
					}
					if (list.get(j).getRefCount() > maxRefCnt) {
						maxRefCnt = list.get(j).getRefCount();
						maxIndex = j;
					}
				}
				if (list.size() == cacheSize) {
					if (hit == false) {
						list.remove(maxIndex);
							list.add(new Node(cities[i], 0));
						answer += 5;
					} else {
						answer += 1;
					}
				} else {
					if (hit == false) {
						list.add(new Node(cities[i], 0));
						answer += 5;
					} else {
						answer += 1;
					}
				}
				hit = false;
			}
			return answer;
		}
	}
}