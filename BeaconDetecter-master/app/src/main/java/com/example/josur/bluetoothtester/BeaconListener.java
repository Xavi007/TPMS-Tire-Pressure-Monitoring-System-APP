package com.example.josur.bluetoothtester;

public interface BeaconListener {
    void beaconRecieved(String uuid,int minor, int mayor, int P, int Id, int T);

    void scaning(Boolean scanning);
}
