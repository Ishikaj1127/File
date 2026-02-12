<html>

<head>
    <title>Create Account</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div id="signup">
        <div style="height: 60px;">
            <h2>Create New Account</h2>
        </div>
        <form action="signup" method="post">
            <div style="display: flex; gap: 20px;"><input type="text" name="fname" placeholder="First Name" required
                    style="width: 200px;">
                <input type="text" name="lname" placeholder="Last Name" required style="width: 200px;">
            </div>
            <p style="margin: 0;">Date of Birth</p>
            <input type="date" name="dob" required style="width: 420px;">
            <p style="margin: 0;">Gender</p>
            <div style="display: flex; gap: 15px;"><label><input type="radio" name="gender" value="Male"
                        style="height: 15px; width: 15px;">Male</label>
                <label><input type="radio" name="gender" value="Female"
                        style="height: 15px; width: 15px;">Female</label>
                <label><input type="radio" name="gender" value="Custom"
                        style="height: 15px; width: 15px;">Custom</label>
            </div>
            <input type="text" name="username" placeholder="Mobile number or email address" required
                style="width: 420px;">
            <input type="password" name="pass" placeholder="Password" required style="width: 420px;">
            <button type="submit">Sign In</button>
        </form>
    </div>
</body>

</html>