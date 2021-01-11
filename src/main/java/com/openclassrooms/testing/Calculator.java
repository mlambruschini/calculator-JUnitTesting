package com.openclassrooms.testing;

public class Calculator {
    public Integer add(int i, int i1) {
        return i + i1;
    }

    public Integer multiply(int i, int i1) {
        return i * i1;
    }

    public void cos(double v) {
        throw new UnsupportedOperationException("Trigonometry not supoprted");
    }

    public void slowCalculation() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            System.out.println("THIS OPERATION COMPLETED AFTER 3 SECONDS");
        }
    }
}
