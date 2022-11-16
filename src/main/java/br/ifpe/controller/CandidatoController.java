package br.ifpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.model.Candidato;
import br.ifpe.model.CandidatoDAO;



@Controller
public class CandidatoController {
	
	@Autowired
	private CandidatoDAO dao;
	
	

	@GetMapping("/exibirCandidato")
	public String exibirForm(Candidato candidato) {
		return "candidato-form";
	}
	
	@PostMapping("/salvarCandidato")
	public String salvarCandidato(Candidato candidato) {
		dao.save(candidato);
		return "redirect:/listarCandidato";
	}
	
	@GetMapping("/listarCandidato")
	public String listarCandidato(Model model) {
		model.addAttribute("lista", dao.findAll());
		return "candidato-list";
	}
	
	@GetMapping("/removerCandidato")
	public String removerCandidato(Integer codigo) {
		dao.deleteById(codigo);
		return "redirect:/listarCandidato";
	}
	
	@GetMapping("/editarCandidato")
	public String editarCandidato(Integer codigo, Model model) {
		Candidato candidato = dao.findById(codigo).orElse(null);
		model.addAttribute("candidato", candidato);
		return "candidato-form";
	}
}
