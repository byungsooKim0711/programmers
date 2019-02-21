package org.kimbs.algorithms.kakaoblind.newsclustering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NewsClustering {
    public int solution(String str1, String str2) {
		int answer = 0;

		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();

		List<String> str1_sub = new ArrayList<String>();
		for (int i = 0; i < str1.length() - 1; i++) {
			String s = str1.substring(i, i + 2);
			if (s.matches("[A-Z|a-z]+")) {
				str1_sub.add(s);
			}
		}

		List<String> str2_sub = new ArrayList<String>();
		for (int i = 0; i < str2.length() - 1; i++) {
			String s = str2.substring(i, i + 2);
			if (s.matches("[A-Z|a-z]+")) {
				str2_sub.add(s);
			}
		}

		Map<String, Integer> map1 = new HashMap<String, Integer>();
		for (int i = 0; i < str1_sub.size(); i++) {
			if (!map1.containsKey(str1_sub.get(i))) {
				map1.put(str1_sub.get(i), 1);
			} else {
				map1.put(str1_sub.get(i), map1.get(str1_sub.get(i)) + 1);
			}
		}
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		for (int i = 0; i < str2_sub.size(); i++) {
			if (!map2.containsKey(str2_sub.get(i))) {
				map2.put(str2_sub.get(i), 1);
			} else {
				map2.put(str2_sub.get(i), map2.get(str2_sub.get(i)) + 1);
			}
		}
		
		Iterator<String> it = map1.keySet().iterator();
		int AplusB = 0;
		while(it.hasNext()) {
			AplusB += map1.get(it.next());
		}
		it = map2.keySet().iterator();
		while(it.hasNext()) {
			AplusB += map2.get(it.next());
		}
		
		System.out.println(AplusB);
		
		int AunionB = 0;
		it = map1.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(!map2.containsKey(key)) {
				map2.put(key, map1.get(key));
			} else {
				if(map1.get(key) > map2.get(key)) {
					map2.put(key, map1.get(key));
				}
			}
		}
		
		it = map2.keySet().iterator();
		while(it.hasNext()) {
			AunionB += map2.get(it.next());
		}
		
		if(AplusB == 0 && AunionB == 0) {
			return 65536;
		}
		
		answer = (int) (((AplusB/(double)AunionB) -1) * 65536);

		return answer;
	}
}