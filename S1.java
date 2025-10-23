import java.util.*;
public class S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        String inverted = "";
        char ch;
        for(int i = 0 ; i < sentence.length() ; i++){
            ch = sentence.charAt(i);
            if(Character.isUpperCase(ch)){
                inverted = inverted + Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                inverted = inverted + Character.toUpperCase(ch);
            }
        }
        System.out.println(inverted);
    }
    
}
