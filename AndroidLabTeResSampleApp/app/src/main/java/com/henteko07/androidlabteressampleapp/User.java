package com.henteko07.androidlabteressampleapp;

import java.io.Serializable;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class User implements Serializable {
    public static final String USER_KEY = "user";

    public final String name;
    public final Blood blood;

    public User(String name, Blood blood) {
        this.name = name;
        this.blood = blood;
    }
}
