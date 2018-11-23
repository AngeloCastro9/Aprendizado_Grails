<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Área restrita </title>
</head>
<body>
<sec:ifLoggedIn>
    Olá, ${usuario}!
    <a href="/Aprendizado/j_spring_security_logout">Sair</a>
</sec:ifLoggedIn>

</body>
</html>