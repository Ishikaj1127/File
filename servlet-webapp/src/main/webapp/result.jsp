<%@ page import="java.io.*" %>
    <html>

    <head>
        <title>Result</title>
    </head>

    <body>
        <div>
            <p>${filedata}</p>
            <video height="500px" width="400px" controls>
                <source src="${videoPath}" type="video/mp4">
            </video>
        </div>
    </body>

    </html>