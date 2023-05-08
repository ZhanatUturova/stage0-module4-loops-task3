package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int tmp;
        while (second != 0) {
            tmp = first;
            first = second;
            second = tmp % second;
        }
        System.out.println(first);
    }
}
