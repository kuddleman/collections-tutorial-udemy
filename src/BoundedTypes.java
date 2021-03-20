public class BoundedTypes {
    public static void main(String[] args) {
       Integer integerArray[] = { 10, 5, 20, 9};
        PrintSum<Integer> psInteger = new PrintSum<Integer>();
        psInteger.print(integerArray);
    }
}

class PrintSum<T extends Number> {
    public void print(T[] arr) {
        double sum = 0;
        for( T value: arr) {
            sum = sum + value.doubleValue();
        }
        System.out.println("Sum = " + sum);
    }
}
