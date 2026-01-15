<%@ page import="java.io.*" %>
    <html>

    <head>
        <title>Result</title>
    </head>

    <body>
        <% try { String path=System.getProperty("java.io.tmpdir") + "/file.txt" ; FileReader fr=new FileReader(path);
            BufferedReader buff=new BufferedReader(fr); String data="" ; String line; while ((line=buff.readLine())
            !=null) { data +=line; } fr.close(); %>
            <div>
                <%=data%>
            </div>
            <% } catch (Exception e) { e.printStackTrace(); } %>
    </body>

    </html>