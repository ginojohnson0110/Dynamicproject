<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/postdata" method="post">
      <label> Input Id :  </label>
      <input type="text" name = "Id"><br>
      <label> Input name :  </label>
      <input type="text" name = "name"><br>
      <label> Input address :  </label>
      <input type="text" name = "address"><br>
      <input type="submit" value="Save"><br> <br>
      </form>
    
     <form action="/deletedata" method="post">
      <label> Enter ID :  </label>
      <input type="text" name = "id"><br>
      <input type="submit" value="Delete"><br> <br>
      
    </form>

<form action="/updatedata" method="post">
      <label> Input id :  </label>
      <input type="text" name = "id"><br>
      <label> Input name :  </label>
      <input type="text" name = "name"><br>
      <label> Input address :  </label>
      <input type="text" name = "address"><br>
      <input type="submit" value="Update"><br>
      </form>
</body>
</html>