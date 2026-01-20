<%@ page import="java.io.*" %>
    <html>

    <head>
        <title>Result</title>
    </head>

    <body>
        <div>
            <p>${filedata}</p>
            <video height="240" width="320" controls>
                <source src="${videoPath}" type="video/mp4">
            </video>
        </div>
    </body>

    </html>