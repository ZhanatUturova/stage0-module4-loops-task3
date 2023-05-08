package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int res = 0;
        while (firstBoarder <= secondBoarder) {
            res += firstBoarder;
            firstBoarder++;
        }
        System.out.println(res);
    }
}
