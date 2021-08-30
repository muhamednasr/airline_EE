package com.airline.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author Muhamed S. NasR
 */
@Entity
public class Airplane implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String PlaneMake;
    private String modelName;
    private Integer seatingCapacity;
    
    
    @OneToOne(mappedBy ="airplaneDetail")
    private Flight flight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaneMake() {
        return PlaneMake;
    }

    public void setPlaneMake(String PlaneMake) {
        this.PlaneMake = PlaneMake;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(Integer seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
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
        if (!(object instanceof Airplane)) {
            return false;
        }
        Airplane other = (Airplane) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Airpalne{" + "id=" + id + ", PlaneMake=" + PlaneMake + ", modelName=" + modelName + ", seatingCapacity=" + seatingCapacity + '}';
    }
}
