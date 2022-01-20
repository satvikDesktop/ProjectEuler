public class MultipleOf3or5 {

   public static int multipleCalc(){
        int sum=0;
      for(int i=1;i<1000;i++){ 
        if (i%3==0 || i%5==0)
        sum+=i;
      } 
      return sum;
   }

   public static void main (String[]args) {
    System.out.println(multipleCalc());
   }

}
//Completed on Wed, 19 Jan 2022, 13:54