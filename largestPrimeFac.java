public class largestPrimeFac {
   public static void main (String[]args) {
       System.out.println(MaxPrime());
   }
    public static long MaxPrime(){
    long n=600851475143L;
    long div=2;
    long maxFact=0;
    while(n!=0) {
        if(n % div !=0)
           div = div + 1;
        else {
           maxFact = n;
           n = n / div;
           if(n == 1) 
             break;
        }
      }
      return maxFact;
   }
}
//Completed on Thu, 20 Jan 2022, 08:06
