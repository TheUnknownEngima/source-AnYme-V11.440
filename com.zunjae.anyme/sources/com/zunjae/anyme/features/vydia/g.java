package com.zunjae.anyme.features.vydia;

public enum g {
    Increase(0.005f),
    Decrease(-0.005f);
    
    private final float amount;

    private g(float f) {
        this.amount = f;
    }

    public final float getAmount() {
        return this.amount;
    }
}
