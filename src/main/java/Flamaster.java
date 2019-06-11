public class Flamaster {
    public static void changeToNumber(String string) {
        char[] charOfString = string.toCharArray();
        int temp = 0;
        for (int i = 0; i < charOfString.length; i++) {
            if (i == charOfString.length - 1) {
                System.out.print(charOfString[i]);
                if (temp > 0) {
                    System.out.print(temp + 1);
                    temp = 0;
                }
            } else if (charOfString[i] == charOfString[i + 1]) {
                temp++;
            } else {
                System.out.print(charOfString[i]);
                if (temp > 0) {
                    System.out.print(temp + 1);
                    temp = 0;
                }
            }
        }
    }
}
