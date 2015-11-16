<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragment/header.jsp" />

<body>

<div class="container">

    <%-- NO NEED YET --%>
    <c:if test="${not empty msg}">
        <div class="alert alert-${css} alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
            <strong>${msg}</strong>
        </div>
    </c:if>

    <h1>Reminder</h1>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Icon</th>
            <th>Name</th>
            <th>Quantity</th>
            <th>Expire Date</th>
            <th>Delete Food</th>
        </tr>
        </thead>

        <c:forEach var="food" items="${foods}">
            <tr>
                <td>${food.icon}</td>
                <td>${food.name}</td>
                <td>${food.quantity}</td>
                <td>${food.expiredate}</td>
                <td>
                    <spring:url value="/food/${food.id}" var="foodUrl" />
                    <button class="btn btn-delete" onclick="location.href='${foodUrl}'">Delete</button>
                </td>
            </tr>
        </c:forEach>
    </table>

</div>

<jsp:include page="../fragment/footer.jsp" />

</body>
</html>