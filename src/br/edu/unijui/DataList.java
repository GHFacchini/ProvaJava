
package br.edu.unijui;

import java.util.ArrayList;
import java.util.List;

public class DataList {
    
    private String title;
    private ArrayList<Data> covidData;

    public DataList() {
        covidData = new ArrayList();
    }
    
    public void addData(Data data){
        covidData.add(data);
    }
    
    public int getNumberOfData(){
        return covidData.size();
    }
    
    public List<Data> getAllData(){
        return covidData;
    }
    
    public List<String> getCities(){
        ArrayList<String> cities = new ArrayList();
    
        for(Data x : covidData){
            if(!cities.contains(x.getCity())){
                cities.add(x.getCity());
            }
        }
        return cities;   
    }
    
    public List<String> getStates(){
        ArrayList<String> states = new ArrayList();
    
        for(Data x : covidData){
            if(!states.contains(x.getState())){
                states.add(x.getState());
            }
        }
        return states;   
    }
    
    public List<String> getCitiesOfState(String state) {
        ArrayList<String> citiesOfState = new ArrayList();
        for (Data x : covidData){
            if(x.getState().equals(state)) {
                if (!citiesOfState.contains(x.getCity())) {
                    citiesOfState.add(x.getCity());
                }
            }
        }
        return citiesOfState;

    }
    
}