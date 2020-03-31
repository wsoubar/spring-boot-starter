<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<html>
<head>
  <head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>SSV SharedLib Scripts</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" type='text/css' media='screen' href="css/bootstrap.min.css">
    <script src='js/main.js'></script>
</head>
<body>
    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>SSV Gerador de Scripts de cópia de SharedLibs</h1>
        <p>Este App vai gerar os scripts usados na cópia de sharedLibs nos 3 ambientes: Produção, Homologação e 
          Desenvolvimento. Deve-se manter o cadastro de servidores atualizados para que tenhamos sucesso 
          em atualizar todas as máquinas de maneira rápida e assertiva.
        </p>
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <h2>PRODUÇÃO</h2>
          <a class="btn btn-default" href="#" role="button">Gerenciar servidores de PRD &raquo;</a>
        </div>
        <div class="col-md-4">
          <h2>HOMOLOGAÇÃO</h2>
          <a class="btn btn-default" href="#" role="button">Gerenciar servidores de HML &raquo;</a>
       </div>
        <div class="col-md-4">
          <h2>DESENVOLVIMENTO</h2>
          <a class="btn btn-default" href="#" role="button">Gerenciar servidores de DSV &raquo;</a>
        </div>
      </div>

      <hr>

      <footer>
        <p>&copy; 2016 Company, Inc.</p>
      </footer>
    </div> <!-- /container -->  
  <!--
  <div class="container">
    <div class="row">
      <h1>Gerador de scripts de cópia teste 1 de sharedLibs</h1>
      <h3>mensagem: ${message}</h3>
      <h4>Click on this <strong><a href="next">link</a></strong> to visit another page.</h4>
    </div>
    <div class="row">
      <div class="col-md-3">Esquerda</div>
      <div class="col-md-9">Direita</div>
    </div>

  </div>

-->
</body>

</html>