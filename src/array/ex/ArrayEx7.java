package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] socres = new int[4][3];

        String[] subject = {"국어","영어","수학"};

        for (int row = 0; row < socres.length; row++) {
            System.out.println((row+1) + "번 학생의 성적을 입력하세요");
            for(int column = 0; column < socres[row].length; column++){
                System.out.print(subject[column] + " 점수: ");
                socres[row][column] = scanner.nextInt();
            }
        }

        for (int row = 0; row < socres.length; row++) {
            int total = 0;
            for (int column = 0; column < socres[row].length; column++) {
                total += socres[row][column];
            }
            System.out.println((row+1) + "번 학생의 총점: " + total + ", 평균: " + (double) total / socres[row].length );
        }
    }
}
