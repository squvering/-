public class Kata
{
  public static boolean isDigitsEquals(int[] arr, long m) {
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while(m > 0) {
            arr[(int)(m%10)]++;
            m/=10;
        }
        for(int i=0; i < 10; i++)
            if(arr[i] != arr1[i])
                return false;
        return true;
    }

    public static long nextSmaller(long n)
    {
        long xyz = n;
        int digits = 0;
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      
        while(xyz > 0) {
            arr[(int)(xyz%10)]++;
          digits++;
          xyz/=10;
        }
      
        xyz = n;
        int cnt = 0;
        while(xyz > 0) {
            cnt++;
            xyz/=10;
        }
        long i = 0;
      int k = 0;
        for(int j = digits; j > 0; j--) {
          while(arr[k] > 0) {
            i = i * 10 + arr[k];
            j--;
            arr[k]--;
          }
          k++;
        }
      // i = n - 1; i > (long)Math.pow(10, cnt - 1); i--
        for(; i < n; i++) {
            if(isDigitsEquals(arr, i))
                return i;
        }
        return -1;
    }
}