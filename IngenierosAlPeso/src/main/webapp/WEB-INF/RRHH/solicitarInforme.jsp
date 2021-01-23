<%-- 
    Document   : solicitarInforme
    Created on : 23 ene. 2021, 12:08:42
    Author     : Usuario
--%>

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
            <a class="enlace" href="SolicitudController?action=listSolicitudes">Lista peticiones</a>
            <a class="enlace" id="idPag" href="solicitarInforme.jsp">Solicitar informe</a>
            <a class="enlace" href="TrabajadorController?action=listTrabajadores">A�adir trabajador</a>
            <a class="enlace" href="EmpresaController?action=listEmpresas">A�adir empresa</a>
            <a class="enlace" href="ProyectoController?action=listProyectos">A�adir proyecto</a>
            <a class="enlace" href="index.html">Cerrar sesi�n</a>
        </div>

        <!-- Contenido --> 
        <div class="contentCenter">
            <h2>Solicitar informe:</h2>
            <label>Par�metro de b�squeda:</label><br><br>
            <div>
                <label class="contenido">Empresa
                    <input type="radio" name="tipo" id="empresa">
                    <span class="checkmark"></span>
                  </label>
                <label class="contenido">Proyecto
                    <input type="radio" name="tipo" id="proyecto">
                    <span class="checkmark"></span>
                </label> 
                <label class="contenido">Empleado
                    <input type="radio" name="tipo" id="empleado">
                    <span class="checkmark"></span>
                </label><br><br>
            </div>
            <div>
                <label>Mostrar formato:</label><br><br>
                <label class="contenido">Semanal
                    <input type="radio" name="tiempo" id="semanal">
                    <span class="checkmark"></span>
                </label>
                <label class="contenido">Mensual
                    <input type="radio" name="tiempo" id="mensual">
                    <span class="checkmark"></span>
                </label> 
                <label class="contenido">Anual
                    <input type="radio" name="tiempo" id="anual">
                    <span class="checkmark"></span>
                </label>
                <label class="contenido">Periodo determinado
                    <input type="radio" name="tiempo" id="periodo">
                    <span class="checkmark"></span>
                </label><br><br>
            </div>
            <form action="informe.html">
                <button type="submit" class="btnAdd" onclick="solicitarInforme()">Solicitar informe</button><br><br>
            </form>
        </div>   
        

        <!-- Pie de pagina -->
        <div class="footerLargo">Ingenieros al peso S.A. - Campus Universitario, Ctra. Madrid-Barcelona km, 33, 600, 28805 Alcal� de Henares - Tel�fono: 900.000.000
            <br> Condiciones generales de venta, pol�tica de privacidad y utilizaci�n web y APP
            <br> � Ingenieros al peso S.A. 2020
        </div>
    </body>
</html>
