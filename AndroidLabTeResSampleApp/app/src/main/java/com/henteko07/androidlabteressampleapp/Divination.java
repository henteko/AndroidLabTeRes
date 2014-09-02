package com.henteko07.androidlabteressampleapp;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class Divination {
    public final String result;
    public final Double compatibility;

    public final User mfirstUser;
    public final User msecondUser;

    public Divination(User firstUser, User secondUser) {
        mfirstUser = firstUser;
        msecondUser = secondUser;

        this.result = "めっちゃいいでw";
        this.compatibility = 100.0;
    }
}
