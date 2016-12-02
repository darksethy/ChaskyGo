package chaskigo.com.pe.chaskigo.models;

/**
 * Created by dsullon on 02/12/2016.
 */

public class Vehicle {
    private String id;
    private String model;
    private String licencePlate;
    private String color;
    private String manufactureYear;
    private String engineNumber;
    private String serialNumber;
    private String idBrand;

    public Vehicle() {
    }

    public Vehicle(String id, String model, String licencePlate, String color, String manufactureYear, String engineNumber, String serialNumber, String idBrand) {
        this.setId(id);
        this.setModel(model);
        this.setLicencePlate(licencePlate);
        this.setColor(color);
        this.setManufactureYear(manufactureYear);
        this.setEngineNumber(engineNumber);
        this.setSerialNumber(serialNumber);
        this.setIdBrand(idBrand);
    }

    public String getId() {
        return id;
    }

    public Vehicle setId(String id) {
        this.id = id;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public Vehicle setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public Vehicle setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
        return this;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public Vehicle setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
        return this;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Vehicle setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public String getIdBrand() {
        return idBrand;
    }

    public Vehicle setIdBrand(String idBrand) {
        this.idBrand = idBrand;
        return this;
    }
}
