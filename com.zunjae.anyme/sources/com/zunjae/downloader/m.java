package com.zunjae.downloader;

public enum m {
    Running("Running"),
    Finished("Finished"),
    Failed("Failed");
    
    private final String text;

    private m(String str) {
        this.text = str;
    }

    public final int code() {
        int i = l.a[ordinal()];
        if (i == 1) {
            return 7;
        }
        if (i == 2) {
            return 8;
        }
        if (i == 3) {
            return 16;
        }
        throw new j22();
    }

    public final String getText() {
        return this.text;
    }
}
