<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title>UserDatabase</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
    <script src ="/js/bootstrap.min.js"></script>
  </head>
  <header id="navbar" class="container">
    <nav class="navbar navbar-expand-sm" style="background-color: #e3f2fd;">
      <a class="navbar-brand" href="#">Navbar</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="/list">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <c:choose>
              <c:when test="${user == null}">
                <a class="nav-link active" href="/add-user">Add User <span class="sr-only">(current)</span></a>
              </c:when>
              <c:otherwise>
                <a class="nav-link disabled" href="#">Add User <span class="sr-only">(current)</span></a>
              </c:otherwise>
            </c:choose>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0" method="post" action="/search">
          <input name="username" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>
  </header>
