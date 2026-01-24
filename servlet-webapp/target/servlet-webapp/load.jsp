<html>

<head>
    <title>load</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div style="display: block;">
        <h1>Loading <span>.</span></h1>

        <div id="loader">
            <div id="loading"></div>
        </div>

        <% String course=request.getParameter("course"); if(course==null) course="" ; %>

            <form id="hiddenForm" action="submit" method="post" style="display:none;">
                <input type="hidden" name="course" value="<%= course %>">
            </form>

            <script>
                setTimeout(function () {
                    document.getElementById("hiddenForm").submit();
                }, 1000); // 2 seconds delay
            </script>
    </div>
</body>

</html>