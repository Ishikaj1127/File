<html>

<head>
    <title>admin</title>
</head>

<body>
    <div>
        <form action="upload" method="post" enctype="multipart/form-data">
            <input type="file" name="video">
            <button type="submit">upload</button>
            <p>${message}</p>
        </form>
    </div>
</body>

</html>