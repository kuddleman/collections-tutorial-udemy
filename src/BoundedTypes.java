//public class BoundedTypes {
//    public static void main(String[] args) {
//       Integer integerArray[] = { 10, 5, 20, 9};
//        PrintSum<Integer> psInteger = new PrintSum<Integer>();
//        psInteger.print(integerArray);
//    }
//}

//class PrintSum<T extends Number & Test1, Test2 > {
//    public void print(T[] arr) {
//        double sum = 0;
//        for( T value: arr) {
//            sum = sum + value.doubleValue();
//        }
//        System.out.println("Sum = " + sum);
//    }
//    public void method1() {
//        System.out.println("here is method 1");
//    }
//    public void method2() {
//        System.out.println("here is method 2");
//    }
//}
//
//interface Test1 {
//  public void method1();
//}
//
//interface Test2 {
//    public void method2();
//}
