package test

import aprendizado.Estoque
import aprendizado.Produto
import aprendizado.VendaController
import grails.testing.mixin.integration.Integration
import grails.transaction.*
import spock.lang.Specification


@Integration
@Rollback
class VendaSpec extends Specification {

    def setup() {

    }

    def cleanup() {
    }

    void "vender 1 produto"() {
        given:
        //o que eu quero fazer antess do teste vem aqui
        Produto produto = new Produto()
        produto.nome = nomeProduto
        produto.preco = precoProoduto
        Estoque estoque = new Estoque()
        estoque.quantidade = quantidadeEstoque
        estoque.quantidadeMinima = quantidadeMinimaEstoque
        produto.setEstoque(estoque)
        produto = produto.save(flush: true)

        VendaController controller = new VendaController()

        def produtos = []
        produtos += produto.id

        def quantidades = []
        quantidades += quantidadeComprada

        controller.params.nome = nomeCliente
        controller.params.email = emailCliente
        controller.params.produto = produtos
        controller.params.quantidade = quantidades


        when:
        //o que eu quero testar vem aqui
        controller.salvar()
        then:
        // o que eu quero verificar logo após o teste vem aqui
        controller.response.json.resposta == "OK"
        where:
        nomeProduto | precoProoduto | quantidadeEstoque | quantidadeMinimaEstoque | quantidadeComprada | nomeCliente | emailCliente
        "arroz"     | 10d           | 100               | 10                      | 1                 | "Ze"        | "zeteste@teste.com"
        "macarrao" | 10d | 100 | 10 | 10 | "Ze" | "zeteste@teste.com"
        //passa dados que estao no give, when e then.

    }
}
