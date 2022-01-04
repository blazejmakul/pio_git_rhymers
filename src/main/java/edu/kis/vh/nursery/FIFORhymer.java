package edu.kis.vh.nursery;

/*
 * FIFORhymer is a rhymer extending DefaultCountingOutRhymer
 * Override countOut method, rest of methods are the same as in default
 *
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        final int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
