package org.kimbs.algorithms.kakaoblind.newid;

public class NewIdRecommend {

    public static String solution(String newId) {
        String answer = newId;

        // 1step
        answer = answer.toLowerCase();

        // 2step
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        // 3step
        answer = answer.replaceAll("[.]+", ".");

        // 4step
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5step
        if (answer.isEmpty()) {
            answer = "a";
        }

        // 6step
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("[.]$", "");

        StringBuilder answerBuilder = new StringBuilder(answer);

        // 7step
        while (answerBuilder.length() <= 2) {
            int index = answerBuilder.length() - 1;
            String end = answerBuilder.substring(index);
            answerBuilder.append(end);
        }


        return answerBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
