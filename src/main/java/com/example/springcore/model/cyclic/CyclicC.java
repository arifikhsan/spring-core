package com.example.springcore.model.cyclic;

@SuppressWarnings("FieldCanBeLocal")
public class CyclicC {
    private final CyclicA cyclicA;

    public CyclicC(CyclicA cyclicA) {
        this.cyclicA = cyclicA;
    }
}
