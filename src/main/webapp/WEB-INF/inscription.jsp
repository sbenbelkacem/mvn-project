<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/css/bootstrap.min.css" integrity="sha384-AysaV+vQoT3kOAXZkl02PThvDr8HYKPZhNT5h/CXfBThSRXQ6jW5DO2ekP5ViFdi" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/js/bootstrap.min.js" integrity="sha384-BLiI7JTZm+JWlgKa0M0kGRpJbF2J8q+qreVrKBC47e3K6BW78kGLrCkeRX6I9RoK" crossorigin="anonymous"></script>
<link href="css/inscription.css" rel="stylesheet" media="all" type="text/css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-4 well well-sm">
            <legend><a href="http://www.jquery2dotnet.com"><i class="glyphicon glyphicon-globe"></i></a> Sign up!</legend>
            <form action="signup" method="post">
            <div class="row">
                <div class="col-xs-6 col-md-6">
                    <input class="form-control" name="nom" placeholder="nom" type="text"
                        required autofocus />
                </div>
                <div class="col-xs-6 col-md-6">
                    <input class="form-control" name="prenom" placeholder="prenom" type="text" required />
                </div>
            </div>
            <input class="form-control" name="email" placeholder="Email" type="email" />
            <input class="form-control" name="password" placeholder="mot de passe" type="password" />
          
            <br />
            <br />
            <button class="btn btn-lg btn-primary btn-block" type="submit">
                Créer</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>