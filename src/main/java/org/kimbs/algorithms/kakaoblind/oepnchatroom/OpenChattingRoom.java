package org.kimbs.algorithms.kakaoblind.oepnchatroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChattingRoom {

    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String[]> actions = new ArrayList<>();

        for (int i=0; i<record.length; i++) {
            String[] r = record[i].split(" ");

            if(r[0].equals("Enter")) {
                map.put(r[1], r[2]);
                actions.add(r);
            } else if(r[0].equals("Change")) {
                map.put(r[1], r[2]);
            } else {
                actions.add(r);
            }
        }

        String[] answer = new String[actions.size()];
        int i = 0;
        for (String[] action : actions) {
            String nickname = map.get(action[1]);
            if(action[0].equals("Enter")) {
                answer[i] = nickname + "님이 들어왔습니다.";
            } else {
                answer[i] = nickname + "님이 나갔습니다.";
            }
            i++;
        }
        return answer;
    }
}