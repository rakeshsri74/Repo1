<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>


<form action="register.html" method = "post">

First Name:<br>
<input type="text" name="firstName" placeholder="Enter First Name">
<br>
<br>

Last Name:<br>
<input type="text" name="lastName" placeholder="Enter Last Name">
<br>
<br>

Contact Number:<br>
<input type="number" name="contactNumber" placeholder="Enter Mobile Number">
<br>
<br>

Address:<br>
<input type="text" name="address" placeholder="Enter your address">
<br>
<br>


City:<br>
<input type="text" name="city" placeholder="Enter your City">
<br>
<br>

State:<br>
<input type="text" name="state" placeholder="Enter your State">
<br>
<br>

Date of Birth:<br>
<input type="text" name="dateOfBirth" placeholder="Enter DOB">
<br>
<br>

Select security question:<br>
<select name="securityQuestion">
  <option  value="What is my school name">What is my school name</option>
  <option  value="What was my first vehicle number">What was my first vehicle number</option>
  <option  value="My favorite food">My favorite food</option>
</select>
<br>
<br>
Answer for security question:<br>
<input type="text" name="securityAnswer" placeholder="Enter Answer">
<br>
<br>

Enter Email Id:<br>
<input type="email" name="emailId" placeholder="Enter your Email Id">
<br>
<br>


Enter Password:<br>
<input type="password" name="password" placeholder="Enter Password">
<br>
<br>
<button type="submit">Submit</button>
</form>


</body>
</html>