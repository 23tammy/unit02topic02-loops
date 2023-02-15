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
    for (int i = 1; i <= n; i++ ){ //array with correct # of factors- 0
      if (n%i == 0){
        factors = new int[factors.length+1];
      }
    }
    int index = 0;
    for (int x = 1; x <= n; x++){
      if (n%x == 0){
        factors[index] = x; //x is what changes
        index++;
      }
    }
    return factors;
  }

  private static int rollDie() {
    int die6 = (int) ((Math.random()*6) + 1);
    return die6;
  }

  private static int rollDieSixTimes() { //rolling a 1 six times
    int count6 = 0;
    int atLeast1 = 0;
    for (int i = 0; i < 6; i++){
      int currentRoll = rollDie();
      //System.out.println(currentRoll);
      if (currentRoll == 1){
        count6++;
      }
    }
    return count6;
  }

  private static int rollDieTwelveTimes() {
    int count12 = 0;
    int atLeast1 = 0;
    for (int i = 0; i < 12; i++){
      int currentRoll = rollDie();
      //System.out.println(currentRoll);
      if (currentRoll == 1){
        count12++;
      }
    }
    return count12;
  }

  public static void PepysSim() {
    int atLeast1 = 0;
    int atLeast1again = 0;
    int trials = 20000;
    for (int i = 0; i < trials; i++){
      int result = rollDieSixTimes();
      if (result >= 1){
        atLeast1++;
      }
    }
    for (int i = 0; i < trials; i++){
      int result = rollDieTwelveTimes();
      if (result >= 1){
        atLeast1again++;
      }
    }
    System.out.println("Likelyhood of at least 1 one six times: " + ((double)atLeast1 / (double)trials) + "\nLikelyhood of at least 1 one twelve times: " + ((double)atLeast1again / (double)trials));
    }


  

  public static void main(String[] args) {
    
    //nHellos(300);
    //nRandoms(1);
    //System.out.println(isPrime(19));
    //System.out.println(Arrays.toString(getFactors(24)));;
    PepysSim();

  }

}