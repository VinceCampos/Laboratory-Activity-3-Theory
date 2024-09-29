import java.util.*;
public class DFA{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String state = "q0";

        System.out.print("Input Strings: ");
        String input = scan.nextLine();

        for (int x = 0; x < input.length(); x++) {
            if (state.equals("q0") && input.charAt(x) == '0') {

                state = "q1";
            } else if (state.equals("q0") && input.charAt(x) == '1') {

                state = "q0";
            } else if (state.equals("q1") && input.charAt(x) == '0') {

                state = "q1";
            } else if (state.equals("q1") && input.charAt(x) == '1') {

                state = "q2";
            } else if (state.equals("q2") && input.charAt(x) == '0') {

                state = "q1";
            } else if (state.equals("q2") && input.charAt(x) == '1') {

                state = "q0";
            }else{
                System.out.println("Invalid input.. Exiting automaton");
            }
        }
   
        if(state.equals("q2")){
            System.out.println("Strings " + input +  " is accepted");
        }else{
            System.out.println("Strings " + input + " is not accepted");
        }
    }
}