package com.zunjae.dynsourcegen;

public enum f {
    All("All"),
    Cloud("Cloud"),
    Native("Native"),
    Local("Browser"),
    NSFW("NSFW");
    
    private final String text;

    private f(String str) {
        this.text = str;
    }

    public final String getText() {
        return this.text;
    }
}
