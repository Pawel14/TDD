import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LiczbyRzymskieTest {
    @Test
    public void shoulReturnIfStringIsEmpty() {
        //given
        LiczbyRzymskie liczbyRzymskie = new LiczbyRzymskie();

        //when
       int result = liczbyRzymskie.liczbaRzym("");

        //then
        assertEquals(0,result);
    }


    @Test
    public void shouldReturnIfLiczbaRzymskaContainsOnlyZnakiRzymskie() {
        //given
        LiczbyRzymskie liczbyRzymskie = new LiczbyRzymskie();

        //when
        int result = liczbyRzymskie.sprawdzanieDozwolonych("fpe");

        //then
        assertEquals(0, result);
    }

//    @Test
//    public void shouldReturnIf() {
//        //given
//        LiczbyRzymskie liczbyRzymskie = new LiczbyRzymskie();
//
//        //when
//        int result = liczbyRzymskie.romanToArab("LX");
//
//        //then
//        assertEquals(0, result);
//    }


}