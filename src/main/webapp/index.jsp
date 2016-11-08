<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>smBanque</title>
<link href="css/index.css" rel="stylesheet" media="all" type="text/css">
</head>
<body>

<form action="authentifiate" method="get">
<div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
          <h1 class="text-center">Bienvenue à SMBANK</h1>
        </div>
         <div class="modal-body">
             <div class="form-group">
                 <input type="text" class="form-control input-lg" name = "identifiant" placeholder="Identifiant"/>
             </div>

             <div class="form-group">
                 <input type="password" class="form-control input-lg" name = "password" placeholder="Password"/>
             </div>

             <div class="form-group">
                 <input type="submit" class="btn btn-block btn-lg btn-primary" value="Login"/>
                 <span class="pull-right"><a href="inscription.jsp">Créer un compte</a></span><span><a href="#">Mot de passe oublié</a></span>
             </div>
             <h4 id="error">${error }</h4>
         </div>
    </div>
 </div>
 
 </form>
</body>
</html>