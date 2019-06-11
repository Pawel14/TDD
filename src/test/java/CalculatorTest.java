import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void shouldReturn15WhenAdd5Plus10(){
        //given
        Calculator calculator = new Calculator();

        //when
        String result = calculator.add("5","10");

        //then
        assertEquals("15", result);

    }

    @Test
    public void shouldThrowExceptionForInvalidNumber(){
        //given
        Calculator calculator = new Calculator();

        //when
        assertThrows(NumberFormatException.class,
                () -> calculator.add("122T", "13"));

        //then
    }



}