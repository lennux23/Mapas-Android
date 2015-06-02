package lennux.com.mx.citiesworld.models;

import java.util.ArrayList;

/**
 * Created by mobilestudio06 on 01/06/15.
 */
public class City {
    private String name;
    private double latitud;
    private double longitud;
    private String picUrl;

    public City(String name, double latitud, double longitud, String picUrl) {
        this.name = name;
        this.latitud = latitud;
        this.longitud = longitud;
        this.picUrl = picUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public static ArrayList<City> getData(){
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(new City("New York", 43.849998, -76.000000,"http://www.themusehotel.com/design/images/930-481/nyc-skyline.jpg"));
        cities.add(new City("Mexico City", 19.426839, -99.134343,"http://static.guim.co.uk/sys-images/Travel/Pix/gallery/2013/2/8/1360339030268/Overview-of-Mexico-City-001.jpg"));
        cities.add(new City("Tokio", 35.704302, 139.732876,"http://anterioresprogramas.paralelo20.com/fotos/409-1.jpg"));
        cities.add(new City("Dubai", 25.210146, 55.288054,"http://globalvillage.gvpedia.netdna-cdn.com/wp-content/uploads/2015/02/Dubai-City-Most-Popular-Attractions-Visit.jpg"));
        cities.add(new City("Rio", -22.913227, -43.194607,"http://blog.guesttoguest.com/wp-content/uploads/2013/11/rio-de-janeiro1.jpeg"));


        return cities;
    }
}
