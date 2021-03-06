<%-- 
    Document   : listaPeticiones.jsp
    Created on : 22-ene-2021, 11:44:17
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>
            Ingenieros al peso S.A. | RRHH
        </title> 
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body id="cuerpo">
         <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="plantilla.css" media="screen" /> 

        <!--JavaScript-->
        <script src="funciones.js"></script>
        
        <!-- Cabecera -->
        <div class="cabecera" id="cabecera">
            <img src="img/logoSmall.png" alt="logo">
        </div>

        <div class="topnav" id="topnav">
            <div class="dropdown">
                <a class="dropbtn">Ver informacion
                  <i class="down"></i>
                </a>
                <div class="dropdown-content">
                    <a href="EmpresaController?action=listEmpresas">Empresa</a>
                    <a href="ProyectoController?action=listProyectos">Proyectos</a>
                    <a href="TrabajadorController?action=listTrabajadores">Trabajadores</a>
                    <a href="infoCalendario.jsp">Calendario</a>
                  </div>
            </div>
            <a class="enlace" id="idPag"  href="SolicitudController?action=listSolicitudes">Lista peticiones</a>
            <a class="enlace" href="solicitarInforme.jsp">Solicitar informe</a>
            <a class="enlace" href="annadirUser.jsp">Añadir trabajador</a>
            <a class="enlace" href="annadirEmpresa.jsp">Añadir/Editar empresa</a>
            <a class="enlace" href="annadirProyecto.jsp">Añadir/Editar proyecto</a>
            <a class="enlace" href="asignarTrabajador.jsp">Asignar trabajador</a>
            <a class="enlace" href="index.html">Cerrar sesión</a>
        </div>

        <!-- Contenido --> 
        <div class="content">
            <table id="tabla">
                <thead>
                    <tr>
                        <th>Id solicitud</th>
                        <th>Id trabajador</th>
                        <th>Tipo</th>
                        <th>Fecha inicio</th>
                        <th>Fecha fin</th>
                        <th>Observaciones</th>
                        <th>Aceptar</th>
                        <th>Rechazar</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${solicitudes}" var="solicitud"> 
                        <c:set var="t" value="${solicitud.tramitada}" />
                        <c:if test="${t==0}">
                            <tr> 
                                <td ><c:out value="${solicitud.idSolicitud}" /></td>
                                <td><c:out value="${solicitud.idTrabajador}" /></td> 
                                <td><c:out value="${solicitud.tipo}" /></td> 
                                <td><c:out value="${solicitud.fechaIni}" /></td>
                                <td><c:out value="${solicitud.fechaFinal}" /></td>
                                <td><c:out value="${solicitud.observacion}" /></td>
                                <td><a href="SolicitudController?action=aceptar&idSolicitud=<c:out value="${solicitud.idSolicitud}"/>">Aceptar</a></td> 
                                <td><a href="SolicitudController?action=rechazar&idSolicitud=<c:out value="${solicitud.idSolicitud}"/>">Rechazar</a></td> 
                            </tr>
                        </c:if>                    
                    </c:forEach>
                </tbody>
            </table>
        </div>   
        

        <!-- Pie de pagina -->
        <div class="footerLargo">Ingenieros al peso S.A. - Campus Universitario, Ctra. Madrid-Barcelona km, 33, 600, 28805 Alcalá de Henares - Teléfono: 900.000.000
            <br> Condiciones generales de venta, política de privacidad y utilización web y APP
            <br> © Ingenieros al peso S.A. 2020
        </div>
    </body>
</html>
