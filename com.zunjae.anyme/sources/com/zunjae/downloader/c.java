package com.zunjae.downloader;

public enum c {
    Wifi(2),
    MobileData(1);
    
    private final int flag;

    private c(int i) {
        this.flag = i;
    }

    public final int getFlag() {
        return this.flag;
    }
}
