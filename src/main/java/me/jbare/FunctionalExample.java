package me.jbare;

public class FunctionalExample {
    public int process(final Data input) {
        int result = 5;

        if ("a".equals(input.getA())) {
            result++;
        } else {
            result--;
        }

        result*=Helper.handle(input.getB());

//        if ("b".equals(input.getB())) {
//            result*=2;
//        } else {
//            result*=4;
//        }

        return result;
    }
}
