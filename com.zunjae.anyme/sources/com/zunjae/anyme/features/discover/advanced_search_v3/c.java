package com.zunjae.anyme.features.discover.advanced_search_v3;

public enum c {
    DubbedOnly("Dub");
    
    private final String textToDisplay;

    private c(String str) {
        this.textToDisplay = str;
    }

    public final String getTextToDisplay() {
        return this.textToDisplay;
    }
}
