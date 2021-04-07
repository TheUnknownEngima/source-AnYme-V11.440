package com.zunjae.anyme.features.firebase;

public enum c {
    ProfileShowCount("ProfileShowCount"),
    FavoriteGenres("FavoriteGenres"),
    PTWShowCount("PTWShowCount"),
    WatchingShowCount("WatchingShowCount"),
    PatchInstalled("PatchInstalled");
    
    private final String key;

    private c(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
