package org.kimbs.algorithms.kakaoblind.traffic;

import java.sql.Timestamp;

public class Traffic {
    public int solution(String[] lines) {
        int answer = 0;
  
        long startTime = 0;
        long workingTime = 0;
        long endTime = 0;
  
        int temp1 = 0;
        int temp2 = 0;
          
        for(int i=0; i<lines.length; i++) {
              
            endTime = Timestamp.valueOf(lines[i].substring(0, 23)).getTime();
              
            workingTime = (long) (Double.valueOf(lines[i].substring(24, lines[i].indexOf("s"))) * 1000);
              
            startTime = endTime - workingTime;
              
            System.out.println(startTime + " ~ " + endTime);
        }
      
  
        for (int i = 0; i < lines.length; i++) {
  
            endTime = Timestamp.valueOf(lines[i].substring(0, 23)).getTime();
            workingTime = (long) (Double.valueOf(lines[i].substring(24, lines[i].indexOf("s"))) * 1000);
            startTime = endTime - workingTime;
  
            for (int j = 0; j < lines.length; j++) {
  
                long nextEndTime = Timestamp.valueOf(lines[j].substring(0, 23)).getTime();
                long nextWorkingTime = (long) (Double.valueOf(lines[j].substring(24, lines[j].indexOf("s"))) * 1000);
                long nextStartTime = nextEndTime - nextWorkingTime +1;
                  
                if(startTime+999 >= nextStartTime && startTime <= nextEndTime) {
                    temp1++;
                }
                if(endTime <= nextEndTime && endTime+999 >= nextStartTime) {
                    temp2++;
                }
            }
  
            if (answer < temp1) {
                answer = temp1;
            }
            if (answer < temp2) {
                answer = temp2;
            }
  
            temp1 = 0;
            temp2 = 0;
        }
        return answer;
    }
}