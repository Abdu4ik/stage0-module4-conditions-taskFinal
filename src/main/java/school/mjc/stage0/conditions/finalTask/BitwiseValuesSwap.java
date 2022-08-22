package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println("After swapping:");
        System.out.print("a = " +first +", b = " +second);

    }
}
