<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <title>UserDatabase</title>
  <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
  <script src ="/js/bootstrap.min.js"></script>
 </head>
<body id="home" class="container">
  <nav class="navbar navbar-expand-sm" style="background-color: #e3f2fd;">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
        <li class="nav-item active">
          <a class="nav-link" href="/add-user">Add User <span class="sr-only">(current)</span></a>
        </li>
      </ul>
      <form class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
      </form>
    </div>
  </nav>
  <br>
  <div class="p-3 mb-2 bg-primary text-white font-weight-bold text-center">List of Users</div>
  <div class="list-group">
    <a href="#" class="list-group-item list-group-item-action">
      Cras justo odio
    </a>
  </div>
</body>
</html>