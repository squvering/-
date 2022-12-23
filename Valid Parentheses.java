public class Solution {

    public static boolean TestBracket(String s, char begin_bracket, char end_bracket) {
        int cnt = 0, a = 0;
        boolean flag = false;
        for(int i=0; i < s.length(); i++) {
            if (begin_bracket == s.charAt(i)) {
                a++;
                cnt++;
            } else if (s.charAt(i) == end_bracket) {
                a--;
                cnt++;
            }
            if(a < 0)
                return false;
        }
      if(cnt == 0)
        return false;
        return a == 0;
    }

    public static boolean validParentheses(String parens) {
      if(parens.equals(""))
        return true;
        if(TestBracket(parens,'{', '}') || TestBracket(parens,'[', ']')
                || TestBracket(parens,'<', '>') || TestBracket(parens,'(', ')'))
            return true;
        return false;
    }
}