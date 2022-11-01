package Kodlama.io.Devs.dilKursu.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.dilKursu.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	void add(Language language);
	void update(Language language);
	void delete(Language language);
	Language getById(int id);
	

}
