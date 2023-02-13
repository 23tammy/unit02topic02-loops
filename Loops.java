public class Loops {

  public static void nHellos (int n){
    for (int i = 1; i <= n; i++){
      if( i%10 == 1 && i != 11 ){
        System.out.println(i + "st hello");
      }else if ( i%10 == 2 && i != 12){
        System.out.println(i + "nd hello");
      }else if ( i%10 == 3 && i != 13){
        System.out.println(i + "rd hello");
      }else{
        System.out.println(i + "th hello");
      }
    }

  }


  public static void main(String[] args) {
    
    nHellos(300);

  }
}