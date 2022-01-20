
public class SumSquareDif {
   public static void main (String[]args) {
           System.out.println(diffCalc());
   }
   public static int diffCalc () {
    int sumsq=0,sqsum=0,dif;
    for(int i=1;i<=100;i++){
        sumsq+=i*i;
        sqsum+=i;
    }
    dif=(sqsum*sqsum)-sumsq;
    return dif;
   }
}
// Completed on Thu, 20 Jan 2022, 14:17