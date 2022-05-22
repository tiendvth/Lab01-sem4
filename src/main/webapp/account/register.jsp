<%@ page import="fptaptech.hellot2009m1.entity.Account" %><%--
  Created by IntelliJ IDEA.
  User: tiendangvan
  Date: 21/05/2022
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
Account account = new Account();
%>



<!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-card-4">
  <div class="w3-container w3-brown">
    <h2>Register</h2>
  </div>
  <form class="w3-container" action="/register" method="post">
    <p>
      <label class="w3-text-brown"><b>UserName</b></label>
      <input class="w3-input w3-border w3-sand" name="username" type="text">
    </p>
    <p>
      <label class="w3-text-brown"><b>Password</b></label>
      <input class="w3-input w3-border w3-sand" name="password" type="password"></p>
    <p>
    <p>
      <label class="w3-text-brown"><b>ConfinPassword</b></label>
      <input class="w3-input w3-border w3-sand" name="password" type="password"></p>
    <p>
    <p>
      <label class="w3-text-brown"><b>FullName</b></label>
      <input class="w3-input w3-border w3-sand" name="fullName" type="text"></p>
    <p>
    <p>
      <label class="w3-text-brown"><b>Email</b></label>
      <input class="w3-input w3-border w3-sand" name="email" type="text"></p>
    <p>
    <p>
      <label class="w3-text-brown"><b>Phone</b></label>
      <input class="w3-input w3-border w3-sand" name="phone" type="text"></p>
    <p>
    <p>
      <label class="w3-text-brown"><b>birthday</b></label>
      <input class="w3-input w3-border w3-sand" name="birthday" type="datetime-local"></p>
    <p>
      <button type="submit" class="w3-btn w3-brown">Register</button></p>
  </form>
</div>

</body>
</html>