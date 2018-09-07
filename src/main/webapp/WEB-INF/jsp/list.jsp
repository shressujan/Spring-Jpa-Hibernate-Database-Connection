<%@ include file="navbar.jsp"%>
<br>
<body id="list">
  <div class="container">
    <div class="p-3 mb-2 bg-primary text-white font-weight-bold text-center">List of Users</div>
    <div class="list-group">
      <c:forEach items="${users}" var="user">
        <a href="/get-user/${user.getUserId()}" class="list-group-item list-group-item-action">
          ${user.getUsername()}
        </a>
      </c:forEach>
    </div>
  </div>
</body>
</html>