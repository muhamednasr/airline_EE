package com.airline.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muhamed S. NasR
 */

@NamedQuery(name ="Passenger.findById",query="SELECT p from Passengers p where p.id = :id")
@Entity
@XmlRootElement
public class Passengers implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String firstName;
    private String lastName;
    
    @Temporal(TemporalType.DATE)
    private Date dob;
    
    @Enumerated(EnumType.STRING)
    private Gender gender;
    
    @Enumerated(EnumType.STRING)
    private FlightClass flightclass;
    
    @ManyToMany(mappedBy = "passengers")
    @JoinTable
    private List<Flight> flights;
    
    

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public FlightClass getFlightclass() {
        return flightclass;
    }

    public void setFlightclass(FlightClass flightclass) {
        this.flightclass = flightclass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passengers)) {
            return false;
        }
        Passengers other = (Passengers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Passengers{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender + ", flightclass=" + flightclass + '}';
    }

   
}
