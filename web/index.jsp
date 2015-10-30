<%-- 
    Document   : indezx
    Created on : 23-mei-2014, 13:13:56
    Author     : Jeffrey
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="wijzer.Overzicht" %>

<%
  Overzicht over = new Overzicht();
  String warning = "";
  String cellen= "";
  try{
     if(request.getParameter("send") != null){ 
      String s=""+request.getParameter("films");
      cellen=over.zoek(s);
    }
  }
  catch(NumberFormatException e){
     warning = "geen film geselecteerd";  
  } 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kijkwijzer</title>
    </head>
    <body>
    <center>
        <img src="images/logo_kijkwijzer.gif" alt="Kijkwijzer Logo">
        <%= cellen %> 
        <form action="index.jsp" method="get">
            <select name="films">
                <option value="X-Men: Days of Future Past">X-Men: Days of Future Past</option>
                <option value="Blended">Blended</option>
                <option value="Cold in July">Cold in July</option>
                <option value="Stand clear of the closing doors">Stand clear of the closing doors</option>
                <option value="Words and Pictures">Words and Pictures</option>
                <option value="The angriest man in Brooklyn">The angriest man in Brooklyn</option>
            </select>
            <input type="submit" name="send">
        </form> 
        
            
    </center>    
    </body>
</html>
