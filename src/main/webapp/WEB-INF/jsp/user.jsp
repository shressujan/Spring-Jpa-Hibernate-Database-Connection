<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <title>User</title>
  <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
</head>
<body id="user">
    <form method="post">
      <div class="container">
        <c:choose>
          <c:when test="${user == null}">
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
                <select type="text" name="state" class="form-control" id="state" placeholder="Nebraska">
                  <option selected>.....</option>
                  <option selected>Nebraska</option>
                  <option selected>NewYork</option>
                  <option selected>Iowa</option>
                  <option selected>Kansas</option>
                </select>
              </div>
              <div class="form-group col-md-2">
                <label for="zipCode">Zip</label>
                <input type="number" name="zipCode" class="form-control" id="zipCode" placeholder="12345">
              </div>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
          </c:when>
          <c:otherwise>
            <div class="form-row">
              <div class="form-group col-md-6">
                <label for="username1">Username</label>
                <input type="text" name="username" class="form-control" id="username1" value="${user.getUsername()}">
              </div>
              <div class="form-group col-md-6">
                <label for="contact1">Contact</label>
                <input type="number" name="contact" class="form-control" id="contact1" value="${user.getContact()}">
              </div>
            </div>
            <div class="form-group">
              <label for="email1">Email</label>
              <input type="email" name="email" class="form-control" id="email1" value="${user.getEmail()}">
            </div>
            <div class="form-group">
              <label for="address11">Address1</label>
              <input type="text" name="address1" class="form-control" id="address11" value="${user.getAddress1()}">
            </div>
            <div class="form-group">
              <label for="address21">Address 2</label>
              <input type="text" name="address2" class="form-control" id="address21" value="${user.getAddress2()}">
            </div>
            <div class="form-row">
              <div class="form-group col-md-6">
                <label for="city1">City</label>
                <input type="text" name="city" class="form-control" id="city1" value="${user.getCity()}">
              </div>
              <div class="form-group col-md-4">
                <label for="state1">State</label>
                <select type="text" name="state" class="form-control" id="state1">
                  <option selected>${user.getState()}</option>
                  <option>Nebraska</option>
                  <option>NewYork</option>
                  <option>Iowa</option>
                  <option>Kansas</option>
                </select>
              </div>
              <div class="form-group col-md-2">
                <label for="zipCode1">Zip</label>
                <input type="number" name="zipCode" class="form-control" id="zipCode1" value="${user.getZipCode()}">
              </div>
            </div>
            <button type="submit" class="btn btn-primary" formaction="/edit-user/${user.getUserId()}">Edit</button>
            <button type="submit" formaction="/delete-user/${user.getUserId()}" class="btn btn-danger">Delete</button>
          </c:otherwise>
        </c:choose>
      </div>
    </form>
</body>
</html>
