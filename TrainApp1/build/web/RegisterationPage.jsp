<%-- 
    Document   : RegisterationPage
    Created on : Jul 23, 2016, 2:42:48 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <script async="" src="//www.google-analytics.com/analytics.js"></script>
        <script src="https://google-code-prettify.googlecode.com/svn/loader/run_prettify.js"></script>

    </head>
    <body style="background-color: white;margin: auto; text-align: center">

        <br/>
        <style>
            .headtexts{
                font-family: century gothic;
                font-size: large;
            }
        </style>
        <form action="reg" method="POST" style="text-align: center">  
            <div class="col-md-5 col-md-offset-3">
                <div class="col-md-12">
                    <table border="0" align="middle" width="350" class="table-condensed" >
                        <thead>
                            <tr>
                                <th class="text" style="color: #990099;font-family: Century Gothic;font-size: x-large;">&nbsp;&nbsp;Registration Details</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td align="middle">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <label class="text-primary" style="margin-top: 5px;">First Name</label>

                                            <span class="material-input"></span>
                                        </div>
                                        <div class="col-md-8">
                                            <input name="fn" type="text" class="form-control">
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td align="middle">
                                    <div class="row">
                                        <div class="col-md-4" >
                                            <label class="text-primary" style="margin-top: 5px;">Last Name</label>
                                        </div>
                                        <div class="col-md-8">
                                            <input name="ln" type="text" class="form-control">
                                            <span class="material-input"></span>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td align="middle">
                                    <div class="col-md-4" >
                                        <label class="text-primary">Date of birth</label>
                                    </div>
                                    <div class="col-md-8">
                                        <input name="dob" type="date" class="form-control" >

                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td align="middle">
                                    <div class="col-md-4">

                                        <label class="text-primary" style="margin-top: 5px;">Email-ID</label>
                                    </div>
                                    <div class="col-md-8">
                                        <input name="email" type="email" class="form-control">


                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="col-md-2">
                                        <label class="text-primary" style="margin-top: 5px;">Gender</label>
                                    </div>
                                    <div class="col-md-5">
                                        <input type="radio" name="gender" value="male" style="margin-top: 5px;">
                                        <label class="text-primary" style="margin-top: 5px;">&emsp;Male</label>

                                    </div>
                                    <div class="col-md-5">
                                        <input type="radio" name="gender" value="female" style="margin-top: 5px;">
                                        <label class="text-primary" style="margin-top: 5px;">&emsp;Female</label>
                                    </div>
                                </td>

                            </tr>
                            <tr>
                                <td align="middle">
                                    <div class="col-md-4">
                                        <label class="text-primary">Password</label>
                                    </div>
                                    <div class="col-md-8">
                                        <input name="password" type="password" class="form-control">
                                        <span class="material-input"></span>
                                    </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td align="middle"><input type="submit" value="Submit" class="btn btn-success"/>
                                    <input type="reset" value="Reset" class="btn btn-danger"/></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </form>
    </body>
</html>
