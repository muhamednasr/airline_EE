<%-- 
    Document   : flight_list
    Created on : Dec 24, 2017, 1:02:44 AM
    Author     : Muhamed S. NasR
--%>

<%@page import="com.airline.models.Passengers"%>
<%@page import="com.airline.models.Pilot"%>
<%@page import="java.util.List"%>
<%@page import="com.airline.models.Flight"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <link rel="Stylesheet" href="resources/styles.css"/>
        <title>Flights List</title>
    </head>
    <body>

        <h1>List Of Flights</h1>
        
        <table>

            <tr>
                <th>ID</th>
                <th>From</th>
                <th>To</th>
                <th>Time</th>
                <th>Price</th>
                <th>Airplane</th>
                <th>Seating</th>
                <th>Number of Pilots</th>
                <th>Pilot Names</th>

            <tr>

                <%


                    List<Flight> flist = (List<Flight>) request.getAttribute("flight_list");

                    for (Integer i = 0; i < flist.size(); i++) {

                %>

            <tr>
                
                <td><%=  flist.get(i).getId() %>  </td> 
                <td><%=  flist.get(i).getFlightOrigin()%>  </td> 
                <td><%=  flist.get(i).getFlightDestination()%>  </td> 
                <td><%=  flist.get(i).getFlightTime()%>  </td> 
                <td><%=  flist.get(i).getPrice()%>  </td> 
                <td><%=  flist.get(i).getAirplaneDetail().getPlaneMake()+" "+ flist.get(i).getAirplaneDetail().getModelName() %>  </td> 
                  <td><%=  flist.get(i).getAirplaneDetail().getSeatingCapacity()  %>  </td> 
                  
                 <td> <%
                 
                 if(flist.get(i).getPilots() != null){
                 
                 %>
                     
                 <%= flist.get(i).getPilots().size()%> Pilots
                 
                     <%
                 
                 }else{
                 
                 %>
                     
No pilots Yet

                 <%
                     
                 
                 }
                
                 %>    </td>
                 
                 
                 <td>  
                 <%
                if(flist.get(i).getPilots() != null){
                  
                    List<Pilot> plist = flist.get(i).getPilots();
                    
                    for(Integer j = 0 ; j <plist.size(); j++){
                    %>
                
                    <%=  (j+1) + ")" +  plist.get(j).getFirstName()+" "+ plist.get(j).getLastName() 
                            +" ("+ plist.get(j).getPilotRank()+")"+  "<br/>"  %>
                 
                
                 <%
                    }
                    
                  %>
                  
                  
                  <%
                    
                  }
                
                 %>
                 
                 </td>
                   

            </tr>
            
            
             <tr>
                
                 <td colspan="9">
                    
                    <%
                    
                 if(flist.get(i).getPassengers().size() > 0){
                 
                 List<Passengers> plist = flist.get(i).getPassengers();
                 
                 for(int k = 0 ;  k < plist.size(); k++ ){
                 
                 %>
                 
                 
                 <%= k+1 %> 
                 
                 )   
                    <%=  plist.get(k).getFirstName() %>
                    <%=  plist.get(k).getLastName() %>
                     
                 <%  
                
                 }
                 }else{
   
                 %>
                 
                 There is no Passengers yet
     
                 <%
                 
                 
                 }
                    
                    %>
                    
                                     
                </td>
                
            </tr>
            
            

            <%                }


            %>
            
            
           
            

        </table>


    </body>
</html>
