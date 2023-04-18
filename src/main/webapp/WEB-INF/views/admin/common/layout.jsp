<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div id="outer_wrap">
    <div id="wrap">
        <header>
            <tiles:insertAttribute name="header" />
        </header>
        <div class="clear"></div>
        <article>
            <tiles:insertAttribute name="body" />
        </article>
        <div class="clear"></div>
        <footer>
            <tiles:insertAttribute name="footer" />
        </footer>
    </div>
</div>
</body>
</html>