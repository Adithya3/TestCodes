package firstTry.interview.microsoft.preparation;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {

    public static boolean isValid(String s) {
        HashMap<Character, Character> paranthesisHashMap = new HashMap<>();
        char temp;
        paranthesisHashMap.put('{', '}');
        paranthesisHashMap.put('}', '{');
        paranthesisHashMap.put(']', '[');
        paranthesisHashMap.put('[', ']');
        paranthesisHashMap.put('(', ')');
        paranthesisHashMap.put(')', '(');
        Stack<Character> aStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!aStack.isEmpty()) {
                temp = aStack.peek();
                if (paranthesisHashMap.get(s.charAt(i)) == temp) {
                    aStack.pop();
                } else {
                    aStack.push(s.charAt(i));
                }
            } else {
                aStack.push(s.charAt(i));
            }
        }
        return aStack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
}
