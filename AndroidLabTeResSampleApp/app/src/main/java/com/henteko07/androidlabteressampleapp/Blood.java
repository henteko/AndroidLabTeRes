package com.henteko07.androidlabteressampleapp;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public enum Blood {
    A("A"),
    B("B"),
    O("O"),
    AB("AB");

    private final String text;

    private Blood(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
