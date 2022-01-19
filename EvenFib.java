public class EvenFib{
       public static void main (String[]args) {
           System.out.println(calculate());  
       }

        public static int calculate(){
        int a=1,b=2,c=0,sum=0;

        while (c<=4000000){
            c=a+b; // 3rd term
            if (c%2==0)
            sum+=c; // sum of even fibbonacci terms
            a=b;
            b=c;
       }
      return sum+2;
    }
}
