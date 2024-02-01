import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//public class CarExample {
//    public static void main(String[] args) {
//        Car sonata1 = new Car("hyundai", 100);
//        sonata1.changeSoftware();
//        sonata1.printSpec();
//
//        Car sonata2 = new Car();
//        sonata2.printSpec();
//
//        Car k5 = new Car();
//        k5.setModel("k5");
//
//    }
//}



//public class Main {
//
//    public static void main(String args[]) {
//        int numberToGuess = new Random().nextInt(100) + 1;
//        Scanner scanner = new Scanner(System.in);
//        int guess;
//        do {
//            System.out.print("숫자를 추측해보세요 (1-100): ");
//            guess = scanner.nextInt();
//            // 조건문 입력해보기.
//            if(guess> numberToGuess ){
//                System.out.print("다운");
//
//            }else if (guess < numberToGuess){
//                System.out.print("업");
//            }
//
//
//        }while(numberToGuess != guess ); // 조건문 입력해보기
//
//        System.out.println("축하합니다! 정답입니다.");
//        scanner.close();
//    }
//}


//    int[] array = {12, 4, 7, 20, 1};
//// for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
//        // 코드 작성하는 부분
//        int max = Arrays.stream(array).max().getAsInt();
//        float avg = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            avg += array[i];
//
//        }
//        avg = avg/ array.length;
//
//        // 결과 출력 (최대값: max, 평균: avg)
//        System.out.println(max);
//        System.out.println(avg);
//    public static void main(String args[]) {
//        // for문을 이용해서 a배열의 값을 b배열로 복사해보세요.
//        int[][] a = {{1, 2, 3}, {4, 5, 6}};
//        int[][] b = new int[3][3];
//
//        // for문 작성하는 부분
//        // …
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                b[i][j]=a[i][j];
//            }
//        }
//
//        // a배열과 b배열 출력
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
//                System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
//            }
//        }
//    }

