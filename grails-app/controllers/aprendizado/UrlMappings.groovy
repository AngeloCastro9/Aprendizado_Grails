package aprendizado

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        '/produto/index' (controller: 'ProdutoController')
        '/areaRestrita/logar'(controller: 'AreaRestritaController')
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
