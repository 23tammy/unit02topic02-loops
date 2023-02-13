import java.util.Arrays;

public class Loops {

  public static void nHellos (int n){
    for (int i = 1; i <= n; i++){
      if( i%10 == 1 && i%100 != 11 ){
        System.out.println(i + "st hello");
      }else if ( i%10 == 2 && i%100 != 12){
        System.out.println(i + "nd hello");
      }else if ( i%10 == 3 && i%100 != 13){
        System.out.println(i + "rd hello");
      }else{
        System.out.println(i + "th hello");
      }
    }
  }

  public static double nRandoms(int n) {
    double num = 0;
    double sum = 0;
    for (int i = 0; i < n; i++){
      num = Math.random();
      System.out.println(num);
      sum += num;
    }
    return(sum / n);
  }

  public static boolean isPrime(int n) {
    for (int i = n-1; i > 1; i--){
      if (n%i == 0){
        return false;
      }
    }
    return true;
  }

  public static int[] getFactors(int n) {
    int[] factors = new int[0];
    int factor = 0;
    for (int i = 1; i <= n; i++ ){ //array with correct # of factors- 0
      if (n%i == 0){
        factor = i;
        factors = new int[factors.length+1];
      }
    }
    int index = 0;
    for (int x = 1; x <= n; x++){
      if (n%x == 0){
        factors[index] = factor;
       
      }
      index++;
    }


    return factors;
    


  }

  //private static int rollDie() {}

  //public static void PepysSim() {}

  public static void main(String[] args) {
    
    nHellos(1);
    nRandoms(1);
    System.out.println(isPrime(19));
    System.out.println(Arrays.toString(getFactors(13)));;

  }

}