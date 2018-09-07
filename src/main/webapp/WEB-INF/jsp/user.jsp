<%@ include file="navbar.jsp"%>
<br><br>
<body id="user">
<form method="post">
  <div class="container">
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="username">Username</label>
        <input type="text" name="username" class="form-control" id="username" placeholder="Username" value="${user.getUsername() != null ? user.getUsername() : ""}">
      </div>
      <div class="form-group col-md-6">
        <label for="contact">Contact</label>
        <input type="number" name="contact" class="form-control" id="contact" placeholder="Contact-Info" value="${user.getContact() != null ? user.getContact() : null}">
      </div>
    </div>
    <div class="form-group">
      <label for="email">Email</label>
      <input type="email" name="email" class="form-control" id="email" placeholder="Email" value="${user.getEmail() != null ? user.getEmail() : null}">
    </div>
    <div class="form-group">
      <label for="address1">Address1</label>
      <input type="text" name="address1" class="form-control" id="address1" placeholder="1234 Main St" value="${user.getAddress1() != null ? user.getAddress1() : null}">
    </div>
    <div class="form-group">
      <label for="address2">Address 2</label>
      <input type="text" name="address2" class="form-control" id="address2" placeholder="Apartment, studio, or floor" value="${user.getAddress2() != null ? user.getAddress2() : null}">
    </div>
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="city">City</label>
        <input type="text" name="city" class="form-control" id="city" placeholder="Kearney" value="${user.getCity() != null ? user.getCity() : null}">
      </div>
      <div class="form-group col-md-4">
        <label for="state">State</label>
        <select type="text" name="state" class="form-control" id="state" placeholder="Nebraska">
          <option selected="${user == null ? true : false}">.....</option>
          <option selected="${user.getState() == "Nebraska" ? true : false}">Nebraska</option>
          <option selected="${user.getState() == "NewYork" ? true : false}">NewYork</option>
          <option selected="${user.getState() == "Iowa" ? true : false}">Iowa</option>
          <option selected="${user.getState() == "Kansas" ? true : false}">Kansas</option>
        </select>
      </div>
      <div class="form-group col-md-2">
        <label for="zipCode">Zip</label>
        <input type="number" name="zipCode" class="form-control" id="zipCode" placeholder="12345" value="${user.getZipCode() != null ? user.getZipCode() : null}">
      </div>
    </div>
    <c:choose>
      <c:when test="${user == null}">
        <button type="submit" class="btn btn-primary" formaction="/add-user">Submit</button>
      </c:when>
      <c:otherwise>
        <button type="submit" class="btn btn-primary" formaction="/edit-user/${user.getUserId()}">Edit</button>
        <button type="submit" formaction="/delete-user/${user.getUserId()}" class="btn btn-danger">Delete</button>
      </c:otherwise>
    </c:choose>
  </div>
</form>
</body>
</html>
