<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flight</title>
</head>
<body>
<div>
        
        Welcome to FlyAway <br>
        
        Ticket Booking <br>
        
       
    
    </div>
    
    
   <form action="FlightSearch" method="post">
    
        <div>
          
          
            <label for="date">Date</label>
          <input type="date"   id="date" name="date" placeholder="yyyy-mm-dd..">
        
        
        </div>
        
        <div>
          <label for="source">Source</label>
                    <select  id="source" name="source">
                        <option value="India">India</option>
                        <option value="US">US</option>
                        <option value="Malaysia">Malaysia</option>
                        <option value="Thailand">Thailand</option>
                        <option value="Qatar">Qatar</option>
                        <option value="Singapore">Singapore</option>
                        <option value="Pakistan">Pakistan</option>
                        <option value="Canada">Canada</option>
                        <option value="Ukraine">Ukraine</option>
                        <option value="Bahrain">Bahrain</option>
                        
                        
                    </select>
        
        
        </div>
        
        
        <div>
        
           <label for="destination">Destination</label>
                    <select  id="destination" name="destination">
                        <option value="China">China</option>
                        <option value="UK">UK</option>
                        <option value="saudi Arabia">saudi Arabia</option>
                        <option value="Russia">Russia</option>
                        <option value="Japan">Japan</option>
                        <option value="Iraq">Iraq</option>
                        <option value="Kenya">Kenya</option>
                        <option value="Afghanistan">Afghanistan</option>
                        <option value="India">India</option>
                        <option value="Srilanka">Srilanka</option>
                        
                    </select>
        
        </div>
        
        
        <div>
        
          <label for="persons">No of Persons</label>
                    <select id="persons" name="persons">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
        
        
        </div>
        
         <button type="submit"  value="Submit">Search Flights</button>
    
    
    
    </form>


</body>
</html>