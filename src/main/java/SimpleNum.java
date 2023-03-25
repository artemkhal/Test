import java.util.ArrayList;
import java.util.List;

public class SimpleNum {


    public static List<Integer> getSimple(int num) {
        List<Integer> simpleNumList = new ArrayList<>();
        int i = 2;
        while (num > 0) {
            synchronized (simpleNumList) {
                if (isPrime(i)) {
                    simpleNumList.add(i);
                    num--;
                }
            }
            i++;
        }
        return simpleNumList;
    }

    private static boolean isPrime(int num) {
        int sqrt = (int) Math.sqrt(num);
        for (int j = 2; j <= sqrt; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
