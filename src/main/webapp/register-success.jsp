<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="container">
    <div class="title">Success</div>
    <div class="content">
        <span class="details">Thank you for registing. Your account now has been activated.</span>
        <h2 class="information">Account information</h2>
        <div class="details">Name: <%= request.getAttribute("name") %></div>
        <div class="details">Username: <%= request.getAttribute("username") %></div>
        <div class="details">Email: <%= request.getAttribute("email") %></div>
        <div class="details">Phone Number: <%= request.getAttribute("phoneNumber") %></div>
        <div class="details">Password: ******</div>
    </div>
</div>

</body>
</html>
