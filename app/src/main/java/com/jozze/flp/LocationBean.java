package com.jozze.flp;

import io.realm.RealmModel;
import io.realm.annotations.RealmClass;

/**
 * Created by joe on 16/8/17.
 */

@RealmClass
public class LocationBean implements RealmModel {

    private long time;
    private double lat;
    private double lon;
    private double altitude;
    private float speed;
    private float accuracy;

    long getTime() {
        return time;
    }

    void setTime(long time) {
        this.time = time;
    }

    double getLat() {
        return lat;
    }

    void setLat(double lat) {
        this.lat = lat;
    }

    double getLon() {
        return lon;
    }

    void setLon(double lon) {
        this.lon = lon;
    }

    double getAltitude() {
        return altitude;
    }

    void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    float getSpeed() {
        return speed;
    }

    void setSpeed(float speed) {
        this.speed = speed;
    }

    float getAccuracy() {
        return accuracy;
    }

    void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

}
