package Kodlama.io.Devs.dilKursu.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.dilKursu.entities.concretes.Language;

public interface LanguageRepositoy {
	
	List<Language> getAll();
	Language getById(int id);
	void add(Language language);
	void update(Language language);
	void delete(Language language);

}
