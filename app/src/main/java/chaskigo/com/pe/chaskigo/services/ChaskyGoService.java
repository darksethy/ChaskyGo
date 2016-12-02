package chaskigo.com.pe.chaskigo.services;

import chaskigo.com.pe.chaskigo.models.Vehicle;

/**
 * Created by dsullon on 02/12/2016.
 */

public class ChaskyGoService {
    public static String VEHICLES_URL = "https://newsapi.org/v1/sources";
    public static String DRIVERS_URL = "https://newsapi.org/v1/articles";

    private Vehicle currentVehicle;

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public void setCurrentSource(Vehicle currentVehicle) {
        this.currentVehicle = currentVehicle;
    }
}
