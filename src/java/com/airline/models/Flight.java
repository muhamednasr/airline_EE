package com.airline.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Muhamed S. NasR
 */
@NamedQuery(name = "Flight.findById", query = "SELECT f from Flight f where f.id = :id")
@Entity
public class Flight implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Enumerated(EnumType.STRING)
    private FlightDestinations flightOrigin;
    
    @Enumerated(EnumType.STRING)
    private FlightDestinations flightDestination;
    
    private Integer price;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date flightTime;
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "airplane_fk")
    private Airplane airplaneDetail;
    
    @OneToMany(mappedBy = "flightForPilot")
    private List<Pilot> pilots;
    
    
    //flight_fk
    
    @ManyToMany
    @JoinTable(name = "f_p_join", joinColumns = @JoinColumn(name = "flight_fk"), inverseJoinColumns =  @JoinColumn(name = "passenger_fk"))
    private List<Passengers> passengers;

    //=========================================================//
    public List<Passengers> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passengers> passengers) {
        this.passengers = passengers;
    }
  
    
    public FlightDestinations getFlightOrigin() {
        return flightOrigin;
    }

    public void setFlightOrigin(FlightDestinations flightOrigin) {
        this.flightOrigin = flightOrigin;
    }

    public FlightDestinations getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(FlightDestinations flightDestination) {
        this.flightDestination = flightDestination;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(Date flightTime) {
        this.flightTime = flightTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Airplane getAirplaneDetail() {
        return airplaneDetail;
    }

    public void setAirplaneDetail(Airplane airplaneDetail) {
        this.airplaneDetail = airplaneDetail;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }
}
