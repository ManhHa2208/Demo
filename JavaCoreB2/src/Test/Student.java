package Test;

import java.util.Scanner;

public class Student {
    private  int id;
    private String name;
    private String hometown;
    private float score;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập hometown");
        String hometown = scanner.nextLine();
        this.name = name;
        this.hometown = hometown;
        this.score = 2f;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void addScore(float score){
        this.score = this.score += score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", score=" + score +
                '}';
    }

    public void printStudent(){
        System.out.println("Score : " + score);
        System.out.println("Name :" + name);
        System.out.println("Hometown :" + hometown);
        if (score < 4){
            System.out.println("Học lực : Yếu");
        }else if (score < 6){
            System.out.println("Học lực Trung bình");
        }else if (score < 8){
            System.out.println("Học lực Khá");
        }else {
            System.out.println("Học lực Giỏi");
        }


    }

}


