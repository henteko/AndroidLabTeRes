package com.henteko07.androidlabteressampleapp.Model;

/**
 * Created by pepe_air on 2014/09/14.
 */
public enum Sex {
    Man("Man"),
    Woman("Woman");

    private final String text;

    private Sex(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
