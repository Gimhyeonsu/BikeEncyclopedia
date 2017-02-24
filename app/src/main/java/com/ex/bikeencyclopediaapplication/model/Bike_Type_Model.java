package com.ex.bikeencyclopediaapplication.model;

import java.io.Serializable;

/**
 * Created by K on 2017-02-22.
 */


public class Bike_Type_Model implements Serializable {

    private int imageButtonRes;

    public Bike_Type_Model(int imageButtonRes) {
        this.imageButtonRes = imageButtonRes;
    }

    public int getImageButtonRes() {
        return imageButtonRes;
    }

    public void setImageButtonRes(int imageButtonRes) {
        this.imageButtonRes = imageButtonRes;
    }
//
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bike_Type_Model{");
        sb.append("imageButtonRes=").append(imageButtonRes);
        sb.append('}');
        return sb.toString();
    }
}
