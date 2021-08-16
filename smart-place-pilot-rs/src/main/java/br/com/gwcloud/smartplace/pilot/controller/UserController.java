package br.com.gwcloud.smartplace.pilot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gwcloud.smartplace.pilot.entities.User;
import br.com.gwcloud.smartplace.pilot.service.UserService;

@RestController
public class UserController {

	@Autowired(required=true)
	private UserService userService;
	
	@PostMapping(path = "/salvar", consumes = "application/json", produces = "application/json")
	public String save (@RequestBody User user) {

		try {
			userService.save(user);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return "Não foi possível cadastrar o usuário" + e.getMessage();
		}
		
		return "Usuário cadastrado com sucesso";
		
	}

	@GetMapping(path = "/eco")
	public String eco () {
		return "acessou o serviço web";
		
	}
}
