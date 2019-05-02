<%@page import="java.util.Iterator"%>
<%@page import="Models.Persona"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
        <title>Lista de personas</title>
    </head>
    <body class="p-3 mb-2 bg-primary text-white">
        <div class="container">
            <h1>Personas</h1>
            <a href="Controlador?accion=add" class="btn btn-light">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-borderless table-hover text-white">
                <thead >
                    <tr>
                        <th class="text-center ">ID</th>
                        <th class="text-center">Nombres</th>
                        <th class="text-center">Apellidos</th>
                        <th class="text-center">Email</th>
                        <th class="text-center">LP</th>
                        <th class="text-center">Hobbies</th>
                    </tr>
                </thead>
                <%
                    PersonaDAO dao = new PersonaDAO();
                    List<Persona> list = dao.listar();
                    Iterator<Persona> iter = list.iterator();
                    Persona per = null;
                    while(iter.hasNext()){
                        per = iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getId() %></td>
                        <td class="text-center"><%= per.getNom()%></td>
                        <td class="text-center"><%= per.getLname()%></td>
                        <td class="text-center"><%= per.getEmail()%></td>
                        <td class="text-center"><%= per.getLP()%></td>
                        <td class="text-center"><%= per.getHob()%></td>
                        <td class="text-center">
                            <a href="Controlador?accion=editar&id=<%= per.getId()%>" class="btn btn-warning">Editar</a>
                            <a href="Controlador?accion=eliminar&id=<%= per.getId()%>" class="btn btn-danger">Remover</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
