<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<sql:query var="rs" dataSource="jdbc/Productos">
    select nombre from productos
</sql:query>
<html>
<body>
<h2>Hello World!</h2>


<h2>Results</h2>

<c:forEach var="row" items="${rs.rows}">
    Foo ${row.nombre}<br/>
</c:forEach>
</body>
</html>
