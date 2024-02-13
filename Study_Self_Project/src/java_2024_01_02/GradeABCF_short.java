package java_2024_01_02;

import java.util.Scanner;

public class GradeABCF_short {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("점수를 입력하시오 = ");
            int score = Integer.parseInt(scan.nextLine());

            if (score >= 90 && score <= 100) {
                System.out.print("A\n");
            } else if (score >= 80 && score <= 89) {
                System.out.print("B\n");
            } else if (score >= 70 && score <= 79) {
                System.out.print("C\n");
            } else if (score < 70) {
                System.out.print("F\n");
            }
        }
    }
}