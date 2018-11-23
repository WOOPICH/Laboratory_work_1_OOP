package com.company;


public class Tester {

    public static void justDoIt() {
        ScannerInput sI = new ScannerInput();
        sI.inputByScanner();
        System.out.println(sI.toString());
        RandomInput rI = new RandomInput();
        rI.inputByRandom();
        System.out.println(rI.toString());
        MathRandInput mRI = new MathRandInput();
        mRI.inputByMathRand();
        System.out.println(mRI.toString());
        Array aI = new Array();
        System.out.println(aI.toString());
    }
}
