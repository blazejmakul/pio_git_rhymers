package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int negative = -1;
    public static final int maxNumber = 12;
    public static final int fullNumber = 11;
    private int[] numbers = new int[maxNumber];

    public int total = negative;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == negative;
    }

    public boolean isFull() {
        return total == fullNumber;
    }

    protected int peekaboo() {
        if (callCheck())
            return negative;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return negative;
        return numbers[total--];
    }

}
