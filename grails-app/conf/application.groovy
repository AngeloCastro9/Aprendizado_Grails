// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'comum.Usuario'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'comum.UsuarioPermissao'
grails.plugin.springsecurity.authority.className = 'comum.Permissao'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
      [pattern:  '/areaRestrita/logar',  access:          ['permitAll']],
//       [pattern:  '/areaRestrita/admin',  access:          ['permitAll']],
//	 [pattern: '/produto/index',               access: ['permitAll']],
//	  [pattern: '/produto/adicionar',               access: ['permitAll']],
//	  [pattern: '/produto/alterar',               access: ['permitAll']],
//	  [pattern: '/produto/excluir',               access: ['permitAll']],
//	  [pattern: '/controlePermissao/**',               access: ['permitAll']],
//      [pattern: '/controlePermissao/index',               access: ['permitAll']],
//      [pattern: '/controlePermissao/salvarUsuario',               access: ['permitAll']],
//      [pattern: '/controlePermissao/excluirUsuario',               access: ['permitAll']],
//      [pattern: '/controlePermissao/salvarPermissao',               access: ['permitAll']],
//      [pattern: '/controlePermissao/excluirPermissao',               access: ['permitAll']],
//      [pattern: '/controlePermissao/**',               access: ['permitAll']],
 [pattern: '/produto/**', access: ['ROLE_ADMIN', 'isFullyAuthenticated()']],
[pattern: '/areaRestrita/**', access: ['ROLE_ADMIN', 'isFullyAuthenticated()']],
[pattern: '/controlePermissao/**', access: ['ROLE_ADMIN', 'isFullyAuthenticated()']],

	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']] ,
    [pattern: '/login/**'  ,          access:          ['permitAll']],
    [pattern: '/login/auth/**',   access: ['permitAll']],

]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

//grails.plugin.springsecurity.auth.loginFormUrl = '/areaRestrita/logar'
grails.plugin.springsecurity.logout.afterLogoutUrl = '/areaRestrita/logout'
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/areaRestrita/admin'
grails.plugin.springsecurity.failureHandler.defaultFailureUrl = '/areaRestrita/erro'
grails.plugin.springsecurity.successHandler.alwaysUseDefault = false
grails.plugin.springsecurity.dao.hideUserNotFoundExceptions = false
grails.plugin.springsecurity.adh.errorPage="/j_spring_security_logout"
grails.plugins.springsecurity.failureHandler.defaultFailureUrl = '/'
grails.plugin.springsecurity.password.algorithm = 'SHA-256'
grails.plugin.springsecurity.switchUser.switchUserUrl = 'produto/index'

//comentando essa linha, sai do loop de login
grails.plugin.springsecurity.securityConfigType = "Annotation"



grails.plugins.springsecurity.interceptUrlMap = [

        '/produto/index':        ['ROLE_ADMIN'],
        '/**':              ['IS_AUTHENTICATED_ANONYMOUSLY']
]



