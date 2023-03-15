/* solve 
Given a roman numeral, convert it to an integer.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Constraints:

    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].
    

    What the code should do:
        1- User input as String
        2- Make it interper each digit as the sum of '3' consecutive equals digits and or,
        a single non consecutive digit.
        3- Conditionals to limit the input to max of '3' consecutive equal strings(ex. III),
        4- Conversion of this String as it's related integer values in roman numeral

*/
import java.util.Scanner;
import javax.swing.JOptionPane;

    public class romanToInteger{

        public class digits{     
            private class values {

                    private int I = 1;
                    private int V = 5;
                    private int X = 10;
                    private int L = 50;
                    private int C = 100;
                    private int D = 500;
                    private int M = 1000;
                }
            }
        
        public static void main(String[] args) {
            do{
                digits algs = new digits();
                String s;
                 
                for(int i = 0; 16 < s.length; i++) {
                String s = JOptionPane.showInputDialog(null, "Type a roman number to convert to an integer value:");
                /* strToInt will recieve the converted Int to be interpret as  */
                }
        } while (strToInt != 0);
    }
}