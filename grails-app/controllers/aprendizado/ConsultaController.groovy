package aprendizado

class ConsultaController {

    def index() {
        def lista = []

        //de maneira crescente
        lista = Cliente.executeQuery("select cli from Cliente cli order by nome")


        //de maneira decrescente
        //lista = Cliente.executeQuery("select cli from Cliente cli order by nome desc")

        //outras maneiras de se fazer em ordem decrescente

        //lista = Cliente.createCriteria().list{
        //order("nome","desc")

        //lista = Cliente.findAll().sort{it.nome}.reverse()



        //outros exemplos de se fazer de maneira crescente:

      //  lista = Cliente.findAll().sort{it.nome}

        //lista= Cliente.createCriteria().list{
        //order("nome")


        //Outras formas de fazer a listagem
       // lista = Cliente.findAll()
//        lista = Cliente.createCriteria().list {
//
//        }

     //   lista = Cliente.executeQuery("select cli from Cliente cli")

        //Listando os clientes cujo o nome contem "Z" (Ignore-Case)

        //lista = Cliente.findAllByNomeIlike("%z%")

//        lista = Cliente.createCriteria().list {
//            ilike("nome", "%z%")
//        }

       // lista = Cliente.executeQuery("select cli from Cliente cli where lower(cli.nome) like lower('%z%')")

       //exibindo as bebidas com mais de 500ml

        //lista = Bebida.findAllByLiquidoGreaterThanAndUnidade(500, "ml")

      //exibindo os pratos para 2 pessoas ou mais
        //lista = Prato.findAllByQuantidadePessoasGreaterThan(2)

        //listando sobremesas que possuem mais de 200 calorias e possoues a palavra "bolo" ou custar menos de 5 reais
       /* lista = Sobremesa.createCriteria().list {
            or {
                lt("preco", 5d)

                and {

                    ilike("nome", "%bolo%")
                    gt("calorias", 200)
                }
            }
        }*/

        //Listando produtos que possuem mais de 5 unidades no estoque
//        String hql = "select pro from Produto pro" + "where pro.estoque.quantidade > 2"
//        lista = Produto.executeQuery(hql)


        //listando pedidos que possuem mais de 1 intem

//        lista = Pedido.createCriteria().list {
//            sizeGt("items",1)
//        }
//        render(view:"index", model: [lista: lista.dataHora])


        //listando os pedidos que possuem menos de 3 pedidos no estoque

        lista = Pedido
        render(view:"index", model: [lista: lista.nome])

    }
}
