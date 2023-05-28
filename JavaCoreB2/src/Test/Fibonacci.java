package Test;

public class Fibonacci {

    public static void main(String[] args) {


     int[] listNumber = new int[11];

//    static {
        listNumber[0] = 0;
        listNumber[1] = 1;
        for (int i = 2; i < listNumber.length; i++) {
            listNumber[i] = listNumber[i - 1] + listNumber[i - 2];
        }
//    }


        for (int i =0; i< listNumber.length;i++){
            System.out.println(listNumber[i] + "");
        }





    }
}
