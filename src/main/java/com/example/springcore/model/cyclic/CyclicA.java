package com.example.springcore.model.cyclic;

@SuppressWarnings("FieldCanBeLocal")
public class CyclicA {
    private final CyclicB cyclicB;

    public CyclicA(CyclicB cyclicB) {
        this.cyclicB = cyclicB;
    }
}
