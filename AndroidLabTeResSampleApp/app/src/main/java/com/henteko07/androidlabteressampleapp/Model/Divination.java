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

        this.compatibility = getCompatibility(this.firstUser, this.secondUser);
        this.result = getResult(this.compatibility);
    }

    private String getResult(Double com) {
        if (com >= 100) {
            return "めちゃくちゃ相性ええやん!";
        }else if (com >= 80) {
            return "かなり相性ええな！";
        }else if (com >= 60) {
            return "なかなか相性ええんちゃう？";
        }else if (com >= 40) {
            return "うーん、正直微妙やな…";
        }else if (com >= 20) {
            return "うん、まぁ、こういうときもあるよ…";
        }else {
            return "逆に相性いいで";
        }
    }

    private Double getCompatibility(User firstUser, User secondUser) {
        int nameStringCount = firstUser.name.length() + secondUser.name.length();
        int bloodSum = getBloodRank(firstUser.blood) + getBloodRank(secondUser.blood);

        return downDigit(nameStringCount + bloodSum);
    }

    private Double downDigit(int num) {
        return (num > 100) ? downDigit(num / 10) : num;
    }

    private int getBloodRank(Blood blood) {
        switch (blood) {
            case A:
                return 15;
            case B:
                return 29;
            case O:
                return 43;
            case AB:
                return 33;
        }

        return 100;
    }
}
