import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiczbyRzymskie {


    public int liczbaRzym(String rzymska) {

        if (rzymska.equals("")) ;
        return 0;
    }

    public static final Map<Character, Integer> romanNumb = new HashMap<>();

    public LiczbyRzymskie() {
        romanNumb.put('I', 1);
        romanNumb.put('V', 5);
        romanNumb.put('X', 10);
        romanNumb.put('L', 50);
        romanNumb.put('C', 100);
        romanNumb.put('D', 500);
        romanNumb.put('M', 1000);
    }

    public int sprawdzanieDozwolonych(String inputNumber) {
        if (inputNumber == null || inputNumber.trim().isEmpty())
//            return 0;

//        long numberOfInvalidChars = inputNumber.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> !romanNumb.containsKey(c))
//                .count();

        for (int i = 0; i < inputNumber.length(); i++) {
            if (!romanNumb.containsKey(inputNumber.charAt(i)));
//                return 0;
        }
        return 0;
    }

//    public int romanToArab(String inputNumber) {
//
//
//
//    }


}