
<html>
<head>
    <script rel="javascript" type="text/javascript" href="js/jquery-1.11.3.min.js"></script>
</head>
<body>
<table>
    <thead>
    <th colspan="4">Permissões</th>
    </thead>
    <g:each  in="${permissoes}" var="permissao">
        <tr>
            <td> ${permissao.authority} </td>
            <td><a href="javascript: vincularPermissao(${permissao.id})">Vincular</a> </td>
            <td><a href="javascript: alterarPermissao(${permissao.id})">Alterar</a> </td>
            <td><a href="javascript: excluirPermissao(${permissao.id})">Excluir</a> </td>

        </tr>
    </g:each>
</table>
</body>
</html>