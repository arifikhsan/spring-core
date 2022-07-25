package com.example.springcore.model.cyclic;

@SuppressWarnings("FieldCanBeLocal")
public class CyclicB {
    private final CyclicC cyclicC;

    public CyclicB(CyclicC cyclicC) {
        this.cyclicC = cyclicC;
    }
}
