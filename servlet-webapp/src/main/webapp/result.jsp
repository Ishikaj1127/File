<%@ page import="java.io.*" %>
    <html>

    <head>
        <title>Result</title>
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <div>
            <p>${filedata}</p>
            <video height="300px" width="400px" controls>
                <source src="${videoPath}" type="video/mp4">
            </video>
        </div>
    </body>

    </html>