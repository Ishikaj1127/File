<%@ page import="java.io.*" %>
    <html>

    <head>
        <title>File Upload</title>
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <div class="Cform">
            <h2>Enter details</h2>
            <form method="post" action="load.jsp">
                <select name="course">
                    <option value="">--select--</option>
                    <option value="c">C</option>
                    <option value="java">Java</option>
                    <option value="python">Python</option>

                </select>
                <button type="submit">Submit</button>
            </form>
        </div>

    </body>

    </html>