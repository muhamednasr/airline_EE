package com.airline.webservices.rest;

import com.airline.models.Flight;
import com.airline.service.FlightService;
import com.airline.service.PassengerService;
import java.util.List;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Muhamed S. NasR
 */
@Path("/flightss")
public class FlightsWebService {

    public FlightsWebService() {
    }
    @PersistenceContext(unitName = "airline")
    EntityManager em;
    @EJB
    FlightService fs;
    @Context
    UriInfo fUriInfo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Flight> getFlights() {

        List<Flight> flist = fs.getFlightP();

         
        if(flist ==null){
        
            System.out.println("flist is null  //the theflightwebservice //");
        
        
        }
        else
        { System.out.println("flist not null  //the theflightwebservice //");}
        

        return flist;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{flight_id}")
    public Flight getFlight(@PathParam("flight_id") Integer flightId) {

        // localhost:8080/airline/airlineservices/rest/flightss/1

        Flight f = fs.getFlight(flightId);

        if (f == null) {


            throw new NotFoundException("The Passenger of this id is not found ");

        }
        return f;

    }
}
