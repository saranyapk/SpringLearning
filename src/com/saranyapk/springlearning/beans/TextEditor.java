package com.saranyapk.springlearning.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {

	private SpellChecker spellChecker;
	private String name;

	@Required
	@Autowired
	@Qualifier("SpellChecker2")
	public void setSpellChecker( SpellChecker spellChecker ) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	@PostConstruct
	public void init(){
		System.out.println("Bean is going through init.");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("Bean will destroy now.");
	}
}
