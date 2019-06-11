public class Pesel {
    public static String isValidPesel(String pesel) {

        char[] tab = pesel.toCharArray();

        if (tab.length != 11) {
            return String.valueOf(pesel);
        }

        int[] weights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int j = 0, sum = 0, control = 0;
        int csum = Integer.valueOf(pesel.substring(tab.length - 1));
        for (int i = 0; i < tab.length - 1; i++) {
            char c = pesel.charAt(i);
            j = Integer.valueOf(String.valueOf(c));
            sum += j * weights[i];

        }
        control = 10 - (sum % 10);
        if (control == 10) {
            control = 0;
        }
//        return control == csum;
        return String.valueOf(pesel);
    }
}
