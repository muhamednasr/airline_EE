<%-- 
    Document   : add_passenger
    Created on : Dec 17, 2017, 9:22:53 PM
    Author     : Muhamed S. NasR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>


        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>World Adventures Airlines</title>
    </head>
    <body>


        <div class="container">

            <div class="title"> Add a Passenger </div>

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

            </fieldset>
        </div>



    </body>
</html>
