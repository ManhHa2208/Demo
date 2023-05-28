package StringQuestion;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi");
        String inputText = scanner.nextLine();

        // Chuan hoa xau
        inputText = chuanHoaXau(inputText);

        // Dem so luong khoang trang (space)
        int spaceCount = inputText.split(" ").length;
        System.out.println("Chuỗi vừa nhập: " + inputText + " có " + spaceCount + " tiếng ");

    }

    public static String chuanHoaXau(String input){
        //Trim space ở 2 đầu của chuỗi
        String result = input.trim();

        // Xóa các space thừa giữa các tiếng:
        result = result.replaceAll("\\s+", " ");

        return result;
    }
}
