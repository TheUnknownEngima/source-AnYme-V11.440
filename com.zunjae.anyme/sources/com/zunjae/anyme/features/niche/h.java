package com.zunjae.anyme.features.niche;

public enum h {
    TV,
    Upcoming,
    Airing,
    Movies;

    public String toString() {
        int i = g.a[ordinal()];
        if (i == 1) {
            return "TV";
        }
        if (i == 2) {
            return "Upcoming";
        }
        if (i == 3) {
            return "Airing";
        }
        if (i == 4) {
            return "Movies";
        }
        throw new j22();
    }
}
