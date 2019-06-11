import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselTest {

    @Test
    public void shouldReturnTrueIfPeselLenghtIs11(){
        //given
        Pesel pesel = new Pesel();

        //when
      int isValidPesel2 = pesel.isValidPesel("95061410438").length();

        //then
        assertEquals(11, isValidPesel2);
    }

    @Test
    public void shouldReturnTrueIfPeselIsInt(){
        //given
        Pesel pesel = new Pesel();

        //when
//        boolean a =isValid.matches("-?\\d+(\\.\\d+)?");
        boolean isNumeric = pesel.isValidPesel("194").chars().allMatch(Character ::isDigit);
//        boolean isNumeric = Character.isDigit('3');
        //then
//        assertTrue(a);
        assertTrue(isNumeric);
    }

    @Test
    public void shouldReturnTrueIfPeselIsCorrect(){
        //given
        Pesel pesel = new Pesel();

        //when
        String isValidPesel = pesel.isValidPesel("b");
//
        //then
//        assertEquals("95061410439", isValidPesel);
        assertTrue(false);

    }


}