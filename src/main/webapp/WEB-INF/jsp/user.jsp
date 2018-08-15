<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <title>User</title>
  <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
  <script src="/webapp/js/bootstrap.min.js"></script>
</head>
<body id="user">

  <form class="container">
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="username">Username</label>
        <input type="text" name="username" class="form-control" id="username" placeholder="Username">
      </div>
      <div class="form-group col-md-6">
        <label for="inputEmail4">Email</label>
        <input type="email" name="email" class="form-control" id="inputEmail4" placeholder="Email">
      </div>
    </div>
    <div class="form-group">
      <label for="inputAddress">Address</label>
      <input type="text" name="address1" class="form-control" id="inputAddress" placeholder="1234 Main St">
    </div>
    <div class="form-group">
      <label for="inputAddress2">Address 2</label>
      <input type="text" name="address2" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
    </div>
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="inputCity">City</label>
        <input type="text" name="city" class="form-control" id="inputCity" placeholder="Kearney">
      </div>
      <div class="form-group col-md-4">
        <label for="inputState">State</label>
        <input type="text" name="state" id="inputState" placeholder="Nebraska">
      </div>
      <div class="form-group col-md-2">
        <label for="inputZip">Zip</label>
        <input type="text" name="zip" class="form-control" id="inputZip" placeholder="68847">
      </div>
    </div>
    <c:choose>
      <c:when test="${user.isEmpty()}">
        <button type="submit" class="btn btn-primary">Edit</button>
      </c:when>
      <c:otherwise>
        <button type="submit" class="btn btn-primary">Submit</button>
      </c:otherwise>
    </c:choose>
  </form>
</body>
</html>