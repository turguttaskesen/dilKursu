package Kodlama.io.Devs.dilKursu.business.concretes;


import java.util.List;

import Kodlama.io.Devs.dilKursu.business.abstracts.LanguageService;
import Kodlama.io.Devs.dilKursu.dataAccess.abstracts.LanguageRepositoy;
import Kodlama.io.Devs.dilKursu.entities.concretes.Language;

public class LanguageManager implements LanguageService{
	private LanguageRepositoy languageRepositoy;

	public LanguageManager(LanguageRepositoy languageRepositoy) {
		super();
		this.languageRepositoy = languageRepositoy;
	}

	@Override
	public List<Language> getAll() {
		// 
		return languageRepositoy.getAll();
	}

	@Override
	public void add(Language language) {
		for (Language lang : languageRepositoy.getAll()) {
			if (language.getName() != lang.getName()) {
				languageRepositoy.add(language);
			}
		}
		
	}

	@Override
	public void update(Language language) {
		languageRepositoy.update(language);
		
	}

	@Override
	public void delete(Language language) {
		languageRepositoy.delete(language);;
		
	}

	@Override
	public Language getById(int id) {
		
		return languageRepositoy.getById(id);
	}

	

}
