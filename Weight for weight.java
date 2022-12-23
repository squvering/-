public class WeightSort {

    public static boolean compareStrings(String s1, String s2) {
        int sum1 = 0, sum2 = 0, num1 = Integer.parseInt(s1), num2 = Integer.parseInt(s2);
        for(int i=0; i < s1.length(); i++){
            sum1 += Character.getNumericValue(s1.charAt(i));
        }
        for(int i=0; i < s2.length(); i++){
            sum2 += Character.getNumericValue(s2.charAt(i));
        }
        if (sum1 > sum2) {
            return true;
        }
        else if(sum2 > sum1) {
            return false;
        }
        else if(s1.compareTo(s2) > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String orderWeight(String string) {
        String[] Str = string.split(" ");

        for(int i=0; i < Str.length; i++) {
            int j = i - 1;
            String curr = Str[i];
            while(j >= 0) {
                if (compareStrings(Str[j], curr)) {
                    Str[j + 1] = Str[j];
                } else {
                    break;
                }
                j--;
            }
            Str[j+1] = curr;
        }
      
      
        String rez = "";
        for(int i=0; i < Str.length - 1; i++) {
            rez += Str[i] + " ";
        }
        rez += Str[Str.length - 1];
        return rez;
    }
}