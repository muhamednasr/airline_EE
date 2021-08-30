<%-- 
    Document   : passengers_list
    Created on : Dec 27, 2017, 5:39:30 PM
    Author     : Muhamed S. NasR
--%>

<%@page import="com.airline.models.Flight"%>
<%@page import="java.util.List"%>
<%@page import="com.airline.models.Passengers"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link rel="Stylesheet" href="resources/styles.css"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
        <title>Passengers List</title>
    </head>
    <body>

        <h1> List of Passengers </h1>

        <table>

            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Date Of Birth</th>
                <th>Gender</th>

            </tr>

            <%


                List<Passengers> plist = (List<Passengers>) request.getAttribute("passengers_list");

                for (Integer i = 0; i < plist.size(); i++) {

            %>

            <tr>
                <td><%=  plist.get(i).getId()%>  </td> 

                <td><%=  plist.get(i).getFirstName()%>  </td> 
                <td><%=  plist.get(i).getLastName()%>  </td> 
                <td><%=  plist.get(i).getDob()%>  </td> 
                <td><%= plist.get(i).getGender()%>  </td> 

            </tr>
            
            
            <tr >
                
                <td colspan="5">
            <%
            
            if( plist.get(i).getFlights().size() != 0){
            
                List<Flight> flist = plist.get(i).getFlights();
            
                for (int j=0 ; j<flist.size();j++){
                    
                
                  %> 
                    
                  
                  <%= j+1 %> )
                  
                  From :<%=  flist.get(j).getFlightOrigin() %> 
                  To : <%= flist.get(j).getFlightDestination() %>
                  @<%= flist.get(j).getFlightTime() %>
                  
                  <br>
                  
                  <%
                }
                       
            }else{
            
            %>    NO Tickets reserved yet     <%
            
            
            }
            
            %>
            </td>
             </tr>  

            <%                }

            %>

        </table>



    </body>
</html>
