package com.app.Projeto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarroController {

	@Autowired
	private CarroDao carroDao;

	@RequestMapping("/carros")
	public String exibirFormulario(Model model) {
		List<Carro> carros = carroDao.findAll();
		model.addAttribute("carros", carros);
		return "carros/form";
	}

	@RequestMapping("/persistirCarro")
	public String persistirCarro(Model model, @RequestParam String nome, @RequestParam double valor) {
		Carro carro = new Carro(nome, valor);
		carroDao.save(carro);
		List<Carro> carros = carroDao.findAll();
		model.addAttribute("carros", carros);
		return "carros/form";
	}

}
