public class FibonacciNumbers {
    static final int SEARCH_RANGE = 20; //Задает диапазон поиска чисел Фибоначчи
    public static void printNumbers(int limit)
    {
        long first = 1;
        long second = 1;
        System.out.println(first);
        System.out.println(second);
        long current;
        for (int i = 0; i<limit; i++)
        {
            current = first + second;
            System.out.println(current);
            first = second;
            second = current;
        }
    }

    public static void main(String[] args) {
        printNumbers(SEARCH_RANGE);
    }
}
