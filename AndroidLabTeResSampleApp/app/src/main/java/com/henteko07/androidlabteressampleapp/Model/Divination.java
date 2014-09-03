package com.henteko07.androidlabteressampleapp.Model;

import java.io.Serializable;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class Divination implements Serializable {
    public final String result;
    public final Double compatibility;

    public final User firstUser;
    public final User secondUser;

    public Divination(User firstUser, User secondUser) {
        this.firstUser = firstUser;
        this.secondUser = secondUser;

        this.result = "めっちゃいいでw";
        this.compatibility = 100.0;
    }
}
