<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>B&oumlrsenspiel</title>
    <!-- Bootstrap CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <!-- Custom Style CSS -->
    <link href="style.css" rel="stylesheet">
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" style="color:white;">B&oumlrsenspiel</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="home.jsp">Home</a></li>
            <li class="active"><a href="aktienmarkt.jsp">Aktienmarkt</a></li>
          </ul>
		  <form class="navbar-form navbar-right" role="form">
            <button class="btn" type="button" onclick="return confirm('M&ouml;chten Sie den B&ouml;rsentag wirklich abschlie&szlig;en?')">B&oumlrsentag abschlie&szligen</button>
          </form>
        </div><!--/.nav-collapse -->
      </div>
    </div>

    <div class="container">

      <div class="starter-template">
        <table class="table table-hover">
		 <thead>
                <tr>
                  <th>#</th>
                  <th>Name</th>
                  <th>Wert in &euro;</th>
                  <th>Letzte &Aumlnderung in %</th>
                  <th>Aktion</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>1</td>
                  <td>E.ON</td>
                  <td>5,50</td>
                  <td>- 0,5</td>
                  <td><button class="btn btn-success">Kaufen</button> <button class="btn btn-danger">Verkaufen</button></td>
                </tr>
                <tr>
                  <td>2</td>
                  <td>BMW</td>
                  <td>4,95</td>
                  <td>- 1,8</td>
                  <td><button class="btn btn-success">Kaufen</button> <button class="btn btn-danger">Verkaufen</button></td>
                </tr>
                <tr>
                  <td>3</td>
                  <td>Audi</td>
                  <td>6,20</td>
                  <td>+ 3</td>
                  <td><button class="btn btn-success">Kaufen</button> <button class="btn btn-danger">Verkaufen</button></td>
                </tr>
              </tbody>
		</table>
      </div>

    </div><!-- /.container -->
     <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="bootstrap.min.js"></script>
	</body>
</html>