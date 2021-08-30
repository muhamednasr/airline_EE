package com.airline.webservices.rest;

import com.airline.models.Flight;
import com.airline.models.Passengers;
import com.airline.service.PassengerService;
import java.util.List;
import java.net.URI;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Muhamed S. NasR
 */
@Path("/passengers")
public class PassengersWebService {

    @PersistenceContext(unitName = "airline")
    EntityManager em;
    @EJB
    PassengerService ps;
    @Context
    UriInfo pUriInfo;

    public PassengersWebService() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Passengers> getPassengers() {

        List<Passengers> plist = ps.getPassengers();

        if(plist ==null){
        
            System.out.println("p list is null  //the wubsevice//");
        
        
        }
        else
        { System.out.println("plist not null  //the wubsevice//");}
        

        return plist;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{passenger_id}")
    public Passengers getPassenger(@PathParam("passenger_id") Integer passengerId) {


        //localhost:8080/airline/airlineservices/rest/passengers/1

        Passengers p = ps.getPassenger(passengerId);

        return p;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPassenger (Passengers p){
           
        ps.addPassenger(p);
        
        UriBuilder pUriBuilder = pUriInfo.getAbsolutePathBuilder();
        
       URI pUri = pUriBuilder.path(String.valueOf(p.getId())).build();
        
        return Response.created(pUri).build();
}
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/edit/{pId}")
    public Response updatePassenger(@PathParam("pId") Integer PassengerId,Passengers pUpdated){
               
    pUpdated = ps.updatePassenger(PassengerId, pUpdated);
      
    if(pUpdated == null ){
    
        System.out.println("the updating thing didn't go well ");
        
        throw new NotFoundException("this passenger was not found ");
    
    }
    
    return Response.ok(pUpdated).build();
    }
    
} 
