public class PowerSumDig {
  
  public static int sumOfNumberDigits(long n) {
    int sum = 0;
    while(n > 0) {
      sum += n%10;
      n /= 10;
    }
    return sum;
  }
  
  public static boolean isPower(long a, long b) { // Проверяем является ли b числом a возведенным в какую-то степень 
    
    if(b % a != 0 || a == 1)
      return false;
    
    while(b % a == 0) {
      b /= a;
    }
    if(b == 1)
      return true;
    else 
      return false;
      
  }
  
    public static long powerSumDigTerm(int n) {
      long i = 10;
      int cnt = 0;
      
      while(cnt < n) {
        ++i;
        if(isPower(sumOfNumberDigits(i), i))
          cnt++;
      }
      return i;
    }
}