package ex6;

public class Digit {
    public static final String[] digit = new String[]{
            "| *** |  *  | *** | *** |*  * |*****| *** |*****| *** | *** |",
            "|*   *| **  |*   *|*   *|*  * |*    |*   *|   * |*   *|*   *|",
            "|*   *|  *  |   * |    *|*  * |*    |*    |  *  |*   *|*   *|",
            "|*   *|  *  |  *  | *** |*****|**** |**** | *   | *** | ****|",
            "|*   *|  *  | *   |    *|   * |    *|*   *|*    |*   *|    *|",
            "|*   *|  *  |*    |*   *|   * |*   *|*   *|*    |*   *|*   *|",
            "| *** | *** |*****| *** |   * | *** | *** |*    | *** | *** |"
    };

    public static void digitToString(int x){
        String result = "";
        char[] arrDigit = String.valueOf(x).toCharArray();
        for(String d:digit){
            for(char a:arrDigit){
                result += d.substring(Character.getNumericValue(a)*6+1, Character.getNumericValue(a)*6+6)
                        .replaceAll("[*]", String.valueOf(a)) + " ";
            }
            result +="\n";
        }
        System.out.println(result);
    }
}
