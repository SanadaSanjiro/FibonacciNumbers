import java.math.BigInteger;

public class FibonacciNumbers {
    static final int SEARCH_RANGE = 100; //Задает диапазон поиска чисел Фибоначчи
    public static void printNumbers(int limit)
    {
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        System.out.println(first);
        System.out.println(second);
        BigInteger current;
        for (int i = 0; i<limit; i++)
        {
            current = first.add(second);
            System.out.println(current);
            first = second;
            second = current;
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        printNumbers(SEARCH_RANGE);
        long end = System.currentTimeMillis() - start;
        System.out.println("Расчет занял " + end + " миллисекунд");
    }
}
