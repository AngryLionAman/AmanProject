<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bharat.com</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100" style="background-image: url('images/bg-01.jpg');">
                <div class="wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33">
                    <%
                    String ErrorMsg = request.getParameter("Error");
                    if(ErrorMsg != null){
                        out.println("<center><b style=color:red;>Invalid UserName and PassWord</b></center>");
                    }
                    %>
                    <form class="login100-form validate-form flex-sb flex-w" name="login" action="validate.jsp">
                        <span class="login100-form-title p-b-53">
                            Sign In With
                        </span>

                        <a href="#" class="btn-face m-b-20">
                            <i class="fa fa-facebook-official"></i>
                            Facebook
                        </a>

                        <a href="#" class="btn-google m-b-20">
                            <img src="images/icons/icon-google.png" alt="GOOGLE">
                            Google
                        </a>

                        <div class="p-t-31 p-b-9">
                            <span class="txt1">
                                Email
                            </span>
                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Username is required">
                            <input class="input100" type="text" name="email" >
                            <span class="focus-input100"></span>
                        </div>

                        <div class="p-t-13 p-b-9">
                            <span class="txt1">
                                Password
                            </span>

                            <a href="forget_password.jsp" class="txt2 bo1 m-l-5">
                                Forgot?
                            </a>
                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Password is required">
                            <input class="input100" type="password" name="password" >
                            <span class="focus-input100"></span>
                        </div>

                        <div class="container-login100-form-btn m-t-17">
                            <button class="login100-form-btn">
                                Sign In
                            </button>
                        </div>

                        <div class="w-full text-center p-t-55">
                            <span class="txt2">
                                Not a member?
                            </span>

                            <a href="Signup Form/NewUser.html" class="txt2 bo1">
                                Sign up now
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>