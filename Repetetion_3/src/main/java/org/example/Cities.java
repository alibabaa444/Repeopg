package org.example;
import java.util.ArrayList;
import java.util.List;

class Cities {
    private List<City> cityList;





    public Cities() {
        cityList = new ArrayList<>(); // Bruger en ArrayList til at holde styr på byer
    }

    public void addCity(City giveMeACityObject) {
        cityList.add(giveMeACityObject);
    }

    public List<City> getCities() {
        return cityList;

    }
}