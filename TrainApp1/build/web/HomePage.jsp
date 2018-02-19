<%-- 
    Document   : HomePage
    Created on : Jul 22, 2016, 11:35:39 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body style="margin: 0 ;padding:0;background-color: white">
        <script>
            function iframeLoaded(iframe) {
                iframe.height = iframe.contentWindow.document.documentElement.offsetHeight + "px";
            }
        </script>
        <style>

            iframe {

                margin: 0;
                padding: 0;
                border: 0;
                line-height: 0;
                float: left;
                display: block;
                border-bottom-width: 0;
            }
            .left
            {
                margin: 0;
                padding: 0;

                float: left;
                font-family: Courier New;
                display: block;
                border-style: solid;
                border-spacing: 0;
                border-right: thick groove #003333;

            }
            .header
            {
                margin: 0;
                padding: 0;

                float: left;
                font-family: Courier New;
                background-color: white;
                    
                display: block;
                //border-style: solid;
                //border-bottom: thick groove #003333;
            }
            .right{

                margin-left: 0;
                padding: 0;
                width: available;

                display: block;
                font-family: Courier New;

            }
            .foot{
                margin: 0;
                padding: 0;
                display: block;
                float: bottom;
                clear: both;
                font-family: Courier New;

                border-style: solid;
                border-top: thick groove #003333;
            }
            .font1{
                font-family: Century Gothic;
                color: darkcyan;
                display: block;
            }

        </style>

        <iframe class="header" frameborder="0" id="header" align="top" name="top" src="HeaderPage.jsp" width="100%" onload="this.height = this.contentWindow.document.documentElement.offsetHeight;" seamless></iframe>
        <!--<iframe class="left" frameborder="0" id="left" align="left" name="left" src="LeftPane.jsp" width="20%" seamless></iframe>-->
        <iframe class="right" frameborder="0" onload="iframeLoaded(this)" id="middle" align="centre" name="middle" src="DescriptionPage.jsp" width="100%" seamless></iframe>
        <iframe class="foot" frameborder="0" id="foot" align="bottom" name="foot" src="Footer.jsp" width="100%" height="70" seamless></iframe>
    </body>
</html>
