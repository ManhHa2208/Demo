package Abstract.Interface;

public class Add {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(0, "Tran Van L", 1 );
        students[1] = new Student(1, "Tran Van A", 1 );
        students[2] = new Student(2, "Tran Van B", 1 );
        students[3] = new Student(3, "Tran Van C", 1 );
        students[4] = new Student(4, "Tran Van D", 2 );
        students[5] = new Student(5, "Tran Van E", 2 );
        students[6] = new Student(6, "Tran Van F", 2 );
        students[7] = new Student(7, "Tran Van G", 3 );
        students[8] = new Student(8, "Tran Van H", 3 );
        students[9] = new Student(9, "Tran Van J", 3 );

        //b: kêu gọi cả lớp đi điểm danh:

        for (Student s: students) {
            s.diemDanh();
        }

        //c) gọi  nhóm 1 đi học bài:

        System.out.println("\n******* câu c ********");
        for (Student s: students){
            if(s.getGroup() == 1){
                s.hocBai();
            }
        }

        //d) gọi nhóm 2 đi dọn vs;

        System.out.println("\n******* câu d ********");
        for (Student s: students){
            if(s.getGroup() == 2){
                s.hocBai();
            }
        }
    }
}
