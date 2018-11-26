package aprendizado

class Cliente {

    String nome
    String email
    //String cpf
    String senha

    static hasMany = [pedidos:Pedido, produtosPreferidos:Produto]

    static constraints = {
        nome nullable: false, blank: false
        email email:true, unique: true
        senha size: 6..10
//        cpf validator: {
//            valor, objeto ->
//                (valor.size() == 11)
//        }
    }

    static mapping ={
        produtosPreferidos joinTable: [name:"preferencias_clientes", key:"id_cliente", column:"id_produto"]
    }
}
