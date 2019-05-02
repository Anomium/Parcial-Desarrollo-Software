<%-- 
    Document   : add
    Created on : 22/03/2019, 11:26:41 AM
    Author     : Melvin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Añadir Persona</title>
    </head>
    <body class="p-3 mb-2 bg-primary text-white">
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Persona</h1>
                <form action="Controlador">

                    Nombre:<br> <input class="form-control" type="text" name="txtNombre"><br>
                    Apellidos:<br> <input class="form-control" type="text" name="txtApellido"><br>
                    Email:<br> <input class="form-control" type="text" name="txtEmail"><br>
                    <label>LP</label><br><select name="cmbxLp">
                        
                        <option value="Java">Java</option>
                        <option value="JavaScript">JavaScript</option>
                        <option value="Python">Python</option>
                        <option value="Ruby">Ruby</option>
                    </select>
                    <br><br>
                    <p>
                        Hobbies: <br>
                        <input type="checkbox" name="cb" value="Autos"> Autos<br>
                        <input type="checkbox" name="cb" value="Deportes"> Deportes<br>
                        <input type="checkbox" name="cb" value="Videojuegos"> Videojuegos<br>
                        <input type="checkbox" name="cb" value="Instrumentos"> Instrumentos<br>
                    </p>
                    
                    <input class="btn btn-light" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=listar" class="btn btn-primary" >Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
