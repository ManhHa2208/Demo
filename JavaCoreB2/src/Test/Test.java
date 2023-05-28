package Test;

public class Test {
    private static final int max_value = 1000000;
    private static long[] listNumber = new long[max_value+1];

   static {
       listNumber[0] = 4;
       listNumber[1] = 7;
       listNumber[2] = 5;
       for (int i = 3; i <= max_value ; i++) {
           listNumber[i] = listNumber[i-1]+listNumber[i-2]+listNumber[i-3];
       }
   }
//   public static void printNumber(int n){
//       for (int i =0; i< listNumber.length;i++){
//           System.out.println(listNumber[i] + "")
//       }
//   }

    public static void main(String[] args) {

//        System.out.println(printNumber(3));





    }

}
