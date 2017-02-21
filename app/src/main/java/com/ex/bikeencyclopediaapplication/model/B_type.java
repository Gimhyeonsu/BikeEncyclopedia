package com.ex.bikeencyclopediaapplication.model;

/**
 * Created by K on 2017-02-21.
 */

public class B_type {

    String a;

    public B_type(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "B_type{" +
                "a='" + a + '\'' +
                '}';
    }
}
