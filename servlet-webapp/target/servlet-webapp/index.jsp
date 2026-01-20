<%@ page import="java.io.*" %>
    <html>

    <head>
        <title>File Upload</title>
    </head>

    <body>
        <div>
            <h2>Enter details</h2>
            <form method="post" action="submit">
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