public class lcmOf20 {
   public static void main (String[]args) {

    int nums[]= new int[20];
    
    for (int i=0,k=1;i<20;i++){
       nums[i]=k;
       k++;
    } 
    int acc=nums[0];
    
    for (int i=0;i<20;i++) {
        acc=lcm(acc,nums[i]);
    }
        System.out.println(acc);

}


   public static int lcm(int a , int b){
    int max = (int)Math.max(a,b);
      while (true){
          if (max%a==0 && max%b==0)
          return max;
         max++;
      }
   }

}
// Completed on Fri, 21 Jan 2022, 03:51