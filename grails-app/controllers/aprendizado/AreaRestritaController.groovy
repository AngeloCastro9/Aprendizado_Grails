package aprendizado

import grails.plugin.springsecurity.annotation.Secured


class AreaRestritaController {
//    @Secured(['ROLE_ADMIN'])
    def index() {

    }

    def logar() {
        render(view: "/areaRestrita/logar")
    }
//    @Secured(['ROLE_ADMIN'])
    def admin(){
        render(view: "/areaRestrita/admin")
    }
//    @Secured(['ROLE_ADMIN'])
    def logout(){
        redirect(action:"logar")
    }

}
