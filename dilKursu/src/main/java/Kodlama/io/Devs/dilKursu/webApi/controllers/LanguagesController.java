package Kodlama.io.Devs.dilKursu.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.dilKursu.business.abstracts.LanguageService;
import Kodlama.io.Devs.dilKursu.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private LanguageService languageService;

	public LanguagesController() {
		super();
	}

	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	@PostMapping("/add")
	public void add(Language language) {
		languageService.add(language);
	}
	@DeleteMapping("/delete")
	public void delete(Language language) {
		languageService.delete(language);;
	}
	@PutMapping("/update")
    public void update(Language language){
        languageService.update(language);
    }
	@GetMapping ("/getById")
    public Language getById(int id){
        return languageService.getById(id);
    }

}
