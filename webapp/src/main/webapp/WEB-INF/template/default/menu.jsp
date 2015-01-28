<%@ include file="../../init.jspf" %>

<div class="menu">
Menu
    <ul>
        <li>
            <spring:url value="/home" var="homeUrl" htmlEscape="true"/>
            <a href="${homeUrl}">Home</a>
        </li>
        <li>
            <spring:url value="/about" var="aboutUrl" htmlEscape="true"/>
            <a href="${aboutUrl}">About</a>
        </li>
        <li>
            <spring:url value="/account" var="accountUrl" htmlEscape="true"/>
            <a href="${accountUrl}">Account</a>
        </li>
        <li>
         <spring:url value="/j_spring_security_logout" var="logoutUrl" htmlEscape="true"/>
          <a href="${logoutUrl}">Logout</a>
        </li>
        <li>
            <spring:url value="/login" var="loginUrl" htmlEscape="true"/>
            <a href="${loginUrl}">Login</a>
        </li>

        <li>
                    <spring:url value="/formexample" var="feUrl" htmlEscape="true"/>
                    <a href="${feUrl}">Form Example</a>
                </li>

        <li>
            <spring:url value="/numberlist/start" var="nlUrl" htmlEscape="true"/>
            <a href="${nlUrl}">Numberlist</a>
        </li>
    </ul>
</div>