package org.example.record;

public record Period(int minutes) {

    public Period() {
        this(0);
    }

    public Period(int m, int n) {
        this(getTmp(m, n));
    }

    private static int getTmp(int m, int n) {
        var tmp = 0;
        if (m > n) {
            tmp = m - n;
        } else {
            tmp = n - m;
        }
        return tmp;
    }

}
