<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


<div style="padding-left: 100px; padding-right: 100px;">
<h3>List of flight</h3>
	
	<table border="2"> 
		<thead align="center", font-style="x-large"> 
			<tr>
				<td> Id Flight</td>
				<td> Air lines</td>
				<td> Source </td>
				<td> Destination </td>
				<td> Fare </td>
				<td>Local Date</td>
				<td>Seat Count</td> </tr>
			</tr>
		</thead>
								
		<tbody>
			<c:forEach items="${flights }" var="vol">
			
			<tr>
				<td>${vol.flightId }</td>
				<td>${vol.airlines }</td>
				<td>${vol.sources }
				<td>${vol.destination }</td>
				<td>${vol.fare }</td>
				<td>${vol.journeyDate }
				<td>${vol.seatCount }</td>
			<tr>
			</c:forEach>
		</tbody>
		
	</table><br>
			
	<hr>
	
	<h3> Add new flight</h3>
	<br>
	
	<div style="padding-left: 100px; padding-right: 100px;">
	
	<form action="/flight-list" method="POST">
		
			<input type="text" name="airlines" placeholder="Compagnie">
			
			<input type="text" name="sources" placeholder="Source">
			
			<input type="text" name="destination" placeholder="Destination">
			
			<input type="text" name="fare" placeholder="Fare"> <br><br>
			
			<input type="text" name="journeyDate" placeholder="LocalDate">
			
			<input type="number" name="seatCount" placeholder="SeatCount"> <br> <br>
			
			<input type="Submit" value="Add a new flight">
	</form>
	</div>	
	</div>

</body>

</html>	
		
		