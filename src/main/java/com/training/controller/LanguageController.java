package com.training.controller;

import java.util.Locale;

public enum LanguageController {

    ENGLISH(new Locale("en")), UKRAINIAN(new Locale("uk", "UA"));

    private Locale locale;

    private LanguageController(Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }

}