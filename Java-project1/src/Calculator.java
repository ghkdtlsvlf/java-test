public class Calculator {

    int postfixOperator(int a) {
       return ++a;
    }

    public static void main(String[] args) {
        int a = 1;
        Calculator calculator = new Calculator();
        a= calculator.postfixOperator(a);
        System.out.println(a);          // a = 2로 출력되도록 메소드 수정하기
    }

}
