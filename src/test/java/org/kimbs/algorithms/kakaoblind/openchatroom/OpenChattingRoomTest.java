package org.kimbs.algorithms.kakaoblind.openchatroom;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.kimbs.algorithms.kakaoblind.oepnchatroom.OpenChattingRoom;

public class OpenChattingRoomTest {

    private OpenChattingRoom ocr = new OpenChattingRoom();

    @Test
    public void tc1() {
        // arrange
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        // act
        String[] actual = ocr.solution(record);

        // assert
        String[] expected = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        assertArrayEquals(expected, actual);
    }
}