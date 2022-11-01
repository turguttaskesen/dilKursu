package Kodlama.io.Devs.dilKursu.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dilKursu.dataAccess.abstracts.LanguageRepositoy;
import Kodlama.io.Devs.dilKursu.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepositoy{
	
	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			}
		}
		
		return languages.get(id);
	}

	@Override
	public void add(Language language) {
		for (Language lang : languages) {
			if (lang.getName() != language.getName()) {
				languages.add(language);
			}
		}
		languages.add(language);
		
	}

	@Override
	public void update(Language language) {
		for (Language lang : languages) {
			if (lang.getId() == language.getId()) {
				lang.setName(language.getName());
				
			}
		}
		
	}

	@Override
	public void delete(Language language) {
		languages.remove(language);
		
	}

}
