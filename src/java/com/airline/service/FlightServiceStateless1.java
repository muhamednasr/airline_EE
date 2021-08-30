package com.airline.service;

import javax.ejb.Stateless;

/**
 *
 * @author Muhamed S. NasR
 */
@Stateless
public class FlightServiceStateless1 {

    private Integer id = 2345678;
    private String from = "cairo";
    private String to = "Dortmund";
    private Integer numofseats = 500;
    private String airplanemodel = "boeing 787 ";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getNumofseats() {
        return numofseats;
    }

    public void setNumofseats(Integer numofseats) {
        this.numofseats = numofseats;
    }

    public String getAirplanemodel() {
        return airplanemodel;
    }

    public void setAirplanemodel(String airplanemodel) {
        this.airplanemodel = airplanemodel;
    }
    
    
    
    
    
}
