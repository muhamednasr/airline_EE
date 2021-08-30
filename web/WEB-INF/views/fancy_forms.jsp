<%-- 
    Document   : fancy_forms
    Created on : Dec 27, 2017, 10:44:40 PM
    Author     : Muhamed S. NasR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="Stylesheet" href="resources/styles.css"/>
        <title> World Adventures Airlines  </title>
    </head>
    <body>
        <h1>Add A Passenger </h1>


        <div class="container">

            <div class="title">  </div>

            <%

                if (request.getAttribute("errors") != null) {

            %>

            <fieldset>

                <legend> Errors   </legend>

                <ul>

                    <%

                        if (request.getAttribute("firstname_error") != null) {

                    %>

                    <li class="error"> first name Error </li>


                    <%    }%> 



                    <%

                        if (request.getAttribute("lastname_error") != null) {

                    %>

                    <li class="error"> last name Error </li>


                    <%    }%> 


                    <%

                        if (request.getAttribute("date_format_error") != null) {

                    %>

                    <li class="error"> date format Error </li>


                    <%    }%> 

                </ul>

            </fieldset>

            <%
                }

            %>

            <fieldset>

                <legend>Passenger Details</legend>

                <form action="AddPassenger" method="post">

                    <div class="inputfield">
                        First Name: <input type="text" name="first-name" value="<%= request.getAttribute("first_name")%>" />
                    </div>

                    <div class="inputfield">
                        Last Name: <input type="text" name="last-name" value="<%= request.getAttribute("last_name")%>" />
                    </div>

                    <div class="inputfield">
                        DOB: <input type="text" name="dob" value="<%= request.getAttribute("dob")%>" />
                    </div>

                    <div class="inputfield">
                        Gender: <select name="gender" >

                            <option value="Male">male</option>
                            <option value="Female">female</option>

                        </select>
                    </div>

                    <div class="inputfield">
                        <input type="submit" value="add passenger" />
                    </div>

                </form>
                     
                      <hr  />
                    
                        <form action="Passengerss">
                            <input type="submit" value="Existing Passengers" />
                        </form>

            </fieldset>
        </div>




        <div class="container">

 <fieldset>
            <form method="POST" action="AddFlight">
               
                    <legend>Flight/Plane Details</legend>

                    <h1> Add a Flight and a Plane  </h1>

                    From :<select name="flight_from">
                        <option value="San_Francisco">San Francisco</option>
                        <option value="Los_Angles">Los Angles</option>
                        <option value="New_York">New York</option>
                        <option>London</option>
                        <option>Rome</option>
                        <option>Cairo</option>
                        <option value="Amesterdam">Amsterdam</option>
                        <option>Dortmund</option>
                    </select>

                    TO :<select name="flight_to">
                        <option value="San_Francisco">San Francisco</option>
                        <option value="Los_Angles">Los Angles</option>
                        <option value="New_York">New York</option>
                        <option>London</option>
                        <option>Rome</option>
                        <option>Cairo</option>
                        <option value="Amesterdam">Amsterdam</option>
                        <option>Dortmund</option>
                    </select>

                    <br  /><br  />

                    <b>Time of The Flight</b>

                    <hr  />


                    <br  />

                    year :<select name="flight_year">
                        <option>2018</option>
                        <option>2019</option>
                        <option>2020</option>

                    </select>
                    <br>

                    Month :<select name="flight_month">
                        <option value="0">Jan </option>
                        <option value="1">Feb </option>
                        <option value="2">Mar </option>
                        <option value="3"> Apr</option>
                        <option value="4">May </option>
                        <option value="5"> Jun</option>
                        <option value="6">Jul </option>
                        <option value="7">Aug </option>
                        <option value="8">Sep </option>
                        <option value="9">Oct </option>
                        <option value="10"> Nov</option>
                        <option value="11"> Dec </option>


                    </select>
                    <br>

                    Day :<input type="text" name="flight_day" value="" />
                    <br>
                    Hour :<input type="text" name="flight_hour" value="" />
                    <br>
                    Minute :<input type="text" name="flight_minute" value="" />

                    <br  />  <br  />
                    <hr  />
                    Price :<input type="text" name="flight_price" value="" />

                    <br>
                    <br>
                    <b>AirPlane </b>

                    <hr  />


                    AirPlane Make :<input type="text" name="airplane_make" value="" />
                    <br>
                    AirPlane Model :<input type="text" name="airplane_model" value="" />
                    <br>
                    Seating:<input type="text" name="airplane_seating" value="" />
                    <br>
                    <br>
                    <hr />

                    <div class="inputfield">
                        <input type="submit" value="Add" />
                    </div>
                               </form>
     
      <hr  />
                    
                        <form action="Flights">
                            <input type="submit" value="Existing Flights" />
                        </form>

                </fieldset>
                
           
        </div>










        <div class="container">

 <fieldset>
            <form method="POST" action="CreatePilotAndAddToFlight">
               
                    <legend>Details</legend>

                    <h1> Add Pilot to Flight  </h1>

                    First Name :<input type="text" name="pilot_first_name" value="" />
                    <br>
                    Last Name :<input type="text" name="pilot_last_name" value="" />
                    <br>
                    License :<input type="text" name="pilot_license" value="" />
                    <br>
                    Flight ID :<input type="text" name="pilot_id" value="" />
                    <br>
                    Pilot Rank :<select name="pilot_rank">
                        <option>Captain</option>
                        <option value="First_Officer">First Officer</option>
                        <option value="Junior_Officer">Junior Officer</option>
                    
                    </select>
                    
                      

                    <div class="inputfield">
                        <input type="submit" value="add Pilot to Flight" />
                    </div>
                 </form>

                </fieldset>

        </div>






        <div class="container">


            <form method="POST" action="AddPassengerToFlight">
                <fieldset>
                    <legend>Details</legend>

                    <h1> Add Passenger to Flight  </h1>

                    Passenger ID :<input type="text" name="passenger_id" value="" />

                    To the Flight of ID :<input type="text" name="flight_of_id" value="" />

                    <div class="inputfield">
                        <input type="submit" value="add passenger to Flight" />
                    </div>
                </fieldset>



            </form>


        </div>


        <div class="container">


            <form method="POST" action="AddFlightTicketToPassenger">
                <fieldset>
                    <legend>Details</legend>

                    <h1> Add Flight To Passenger</h1>



                    Flight ID :<input type="text" name="flight_id" value="" />

                    The Passenger of ID :<input type="text" name="passenger_of_id" value="" />


                    <div class="inputfield">
                        <input type="submit" value="add Ticket to Passenger " />
                    </div>

                </fieldset>

            </form>
            
            
        </div>
                    
                 
    </body>
</html>
