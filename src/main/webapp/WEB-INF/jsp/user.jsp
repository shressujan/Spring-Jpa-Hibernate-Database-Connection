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
  <div class="container">
    <form method="post">
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="username">Username</label>
          <input type="text" name="username" class="form-control" id="username" placeholder="Username">
        </div>
        <div class="form-group col-md-6">
          <label for="contact">Contact</label>
          <input type="number" name="contact" class="form-control" id="contact" placeholder="Contact-Info">
        </div>
      </div>
      <div class="form-group">
        <label for="email">Email</label>
        <input type="email" name="email" class="form-control" id="email" placeholder="Email">
      </div>
      <div class="form-group">
        <label for="address1">Address1</label>
        <input type="text" name="address1" class="form-control" id="address1" placeholder="1234 Main St">
      </div>
      <div class="form-group">
        <label for="address2">Address 2</label>
        <input type="text" name="address2" class="form-control" id="address2" placeholder="Apartment, studio, or floor">
      </div>
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="city">City</label>
          <input type="text" name="city" class="form-control" id="city" placeholder="Kearney">
        </div>
        <div class="form-group col-md-4">
          <label for="state">State</label>
          <input type="text" name="state" class="form-control" id="state" placeholder="Nebraska">
        </div>
        <div class="form-group col-md-2">
          <label for="zipCode">Zip</label>
          <input type="number" name="zipCode" class="form-control" id="zipCode" placeholder="12345">
        </div>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
      <%--<c:choose>--%>
        <%--<c:when test="${user.isEmpty()}">--%>
          <%--<button type="submit" class="btn btn-primary">Edit</button>--%>
        <%--</c:when>--%>
        <%--<c:otherwise>--%>
          <%--<button type="submit" class="btn btn-primary">Submit</button>--%>
        <%--</c:otherwise>--%>
      <%--</c:choose>--%>
    </form>
  </div>
</body>
</html>