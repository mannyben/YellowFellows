package com.example.sensortest;

public class Data {

    int accelerometerX;
    int accelerometerY;
    int accelerometerZ;
    int gyroscopeX;
    int gyroscopeY;
    int gyroscopeZ;
    int magneticX;
    int magneticY;
    int magneticZ;
    int azimuth;
    int pitch;
    int roll;

    public Data(int aX,int aY, int aZ, int gX, int gY, int gZ, int mX, int mY, int mZ, int a, int p, int r){
        this.accelerometerX = aX;
        this.accelerometerY = aY;
        this.accelerometerZ = aZ;
        this.gyroscopeX = gX;
        this.gyroscopeY = gY;
        this.gyroscopeZ = gZ;
        this.magneticX = mX;
        this.magneticY = mY;
        this.magneticZ = mZ;
        this.azimuth = a;
        this.pitch = p;
        int roll = r;

    }

    public int getAccelerometerX() {
        return accelerometerX;
    }

    public void setAccelerometerX(int accelerometerX) {
        this.accelerometerX = accelerometerX;
    }

    public int getAccelerometerY() {
        return accelerometerY;
    }

    public void setAccelerometerY(int accelerometerY) {
        this.accelerometerY = accelerometerY;
    }

    public int getAccelerometerZ() {
        return accelerometerZ;
    }

    public void setAccelerometerZ(int accelerometerZ) {
        this.accelerometerZ = accelerometerZ;
    }

    public int getGyroscopeX() {
        return gyroscopeX;
    }

    public void setGyroscopeX(int gyroscopeX) {
        this.gyroscopeX = gyroscopeX;
    }

    public int getGyroscopeY() {
        return gyroscopeY;
    }

    public void setGyroscopeY(int gyroscopeY) {
        this.gyroscopeY = gyroscopeY;
    }

    public int getGyroscopeZ() {
        return gyroscopeZ;
    }

    public void setGyroscopeZ(int gyroscopeZ) {
        this.gyroscopeZ = gyroscopeZ;
    }

    public int getMagneticX() {
        return magneticX;
    }

    public void setMagneticX(int magneticX) {
        this.magneticX = magneticX;
    }

    public int getMagneticY() {
        return magneticY;
    }

    public void setMagneticY(int magneticY) {
        this.magneticY = magneticY;
    }

    public int getMagneticZ() {
        return magneticZ;
    }

    public void setMagneticZ(int magneticZ) {
        this.magneticZ = magneticZ;
    }

    public int getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(int azimuth) {
        this.azimuth = azimuth;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
