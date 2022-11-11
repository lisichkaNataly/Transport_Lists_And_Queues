package transport;

import driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();



    public Transport(
            String brand,
            String model,
            double engineVolume){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        if (model== null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        if (engineVolume <= 0 )
            System.out.println("Неверное значение");
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>...mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor...sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }


    public abstract void startDriving();

    public abstract void finishDriving();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();


}
