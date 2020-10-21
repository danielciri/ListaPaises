package com.danielcirilo.listviewcontries;

public class Country {
    private String countryCode;
    private String countryName;
    private float population;
    private String capital;
    private String countryIso3;

    public Country(String countryCode, String countryName, float population, String capital) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
        this.countryIso3 = countryIso3;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public float getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public String getCountryIso3() {
        return countryIso3;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPopulation(float population) {
        this.population = population;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCountryIso3(String countryIso3) {
        this.countryIso3 = countryIso3;
    }
}
