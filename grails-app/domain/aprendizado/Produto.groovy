package aprendizado

class Produto {

    String nome
    Double preco
    Estoque estoque

    static hasMany = [clientes: Cliente, itens:ItemPedido]
    //isso quer dizer que a classe cliente manda na associação muito para muitos
    static belongsTo = [Cliente]
    static constraints = {
        //com isso o usuario nao consegue salvar nada em branco
        nome nullable: false, blank:false
        preco min: new Double(0)
    }

    static mapping = {
        //isso serve para que as tabelas não fiquem juntas no banco de dados, elas ficam separadas
       // tablePerHierarchy false
        discriminator column: "tipo", value: "GERAL"
        estoque column: "id_estoque"
        clientes joinTable: [name:"preferencias_clientes", key:"id_produto", column:"id_cliente"]
    }

}
