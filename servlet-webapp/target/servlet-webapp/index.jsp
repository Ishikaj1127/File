<%@ page import="java.io.*" %>
    <html>

    <head>
        <title>File Upload</title>
    </head>

    <body>
        <div>
            <h2>Enter details</h2>
            <form method="post" action="submit">
                <input type="text" name="name" placeholder="Name" required>
                <input type="number" name="age" placeholder="Age" required>
                <button type="submit">Submit</button>
            </form>
        </div>

    </body>

    </html>