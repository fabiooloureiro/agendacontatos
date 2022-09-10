package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	
	//metodo para mapear a pagina que sera exibida por este controlador
	@RequestMapping(value = "/register") //ROTA (endereço) da pagina
	public ModelAndView register() {
		
		//definir o nome da pagina que o controlador deverá exibir na rota
		//esta pagina deve estar dentro de /WEB-INF/views e ter extensão .jsp
		
		
		//WEB-INF/views/register.jsp
		ModelAndView modelAndView = new ModelAndView("register");
		
		
		
		return modelAndView;
		
	}

}
