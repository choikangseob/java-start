package Array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students =new int[5];

        students[0]=90;
        students[1]=80;
        students[2]=70;
        students[3]=60;
        students[4]=50;
        int total=0;
        for (int student : students) {
            total += student;

        }
        double average = (double)total / students.length;
        System.out.println(total);
        System.out.println(average);
    }
}
