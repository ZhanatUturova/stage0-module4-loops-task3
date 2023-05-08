package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int res = 0;
        t = Math.abs(t);
        for (int i = 0; i <= t + "".length(); i++) {
            res += t % 10;
            t /= 10;
        }
        System.out.println(res + t);
    }
}
