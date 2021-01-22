<%-- 
    Document   : listaUsuario
    Created on : 22-ene-2021, 2:27:12
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
                    <a href="infoTrabajadores.html">Trabajadores</a>
                    <a href="infoCalendario.html">Calendario</a>
                  </div>
            </div>
            <a class="enlace" href="SolicitudController?action=listSolicitudes">Lista peticiones</a>
            <a class="enlace" href="solicitarInforme.html">Solicitar informe</a>
            <a class="enlace" id="idPag" href="TrabajadorController?action=listTrabajadores">Lista de trabajadores</a>
            <a class="enlace" href="annadirUser.jsp">Añadir trabajador</a>
            <a class="enlace" href="index.html">Cerrar sesión</a>
        </div>

        <!-- Contenido -->  
        <div class="content">
            <table id="tabla">
                <thead>
                    <tr>
                        <th>Id trabajador</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Departamento</th>
                        <th>Empresa</th>
                        <th>Proyectos</th>
                        <th>Editar</th>
                        <th>Eliminar</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${trabajadores}" var="trabajador"> 
                        <tr> 
                            <td ><c:out value="${trabajador.idTrabajador}" /></td>
                            <td><c:out value="${trabajador.nombre}" /></td> 
                            <td><c:out value="${trabajador.apellidos}" /></td> 
                            <td><c:out value="${trabajador.departamento}" /></td>
                            <!-- Revisar -->
                            <!--<td><c:out value="${trabajador.empresa}" /></td>-->
                            <!--<td><c:out value="${trabajador.proyectos}" /></td>-->
                            <!-- -->
                            <td><a href="TrabajadorController?action=edit&idTrabajador=<c:out value="${trabajador.idTrabajador}"/>">Editar</a></td> 
                            <td><a href="TrabajadorController?action=delete&idTrabajador=<c:out value="${trabajador.idTrabajador}"/>">Eliminar</a></td> 
                        </tr> 
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
