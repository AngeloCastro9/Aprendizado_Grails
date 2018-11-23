package aprendizado

class Prato extends Produto{

    Integer quantidadePessoas

    static constraints = {
        quantidadePessoas mi: 1
    }
    static mapping = {
        discriminator value: "PRATO"
    }
}
