package org.example.record;

public record Period(int minutes) {

    public Period() {
        this(0);
    }

}
