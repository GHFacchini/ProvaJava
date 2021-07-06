package br.edu.unijui;


public class Data {
    
    private String state;
    private String city;
    private String date;
    private double isolation;

    public Data(String state, String city, double isolation, String date ) {
        this.state = state;
        this.city = city;
        this.isolation = isolation;
        this.date = date;
    }
    
    
    
    
    
    
    

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getIsolation() {
        return isolation;
    }

    public void setIsolation(double isolation) {
        this.isolation = isolation;
    }

    
    

    
}
