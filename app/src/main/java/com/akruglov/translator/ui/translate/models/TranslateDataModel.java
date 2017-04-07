package com.akruglov.translator.ui.translate.models;

import android.support.annotation.NonNull;

/**
 * Created by akruglov on 07.04.17.
 */

public class TranslateDataModel {

    private Language sourceLanguage;
    private Language destinationLanguage;
    private String sourceText;
    private String translatedText;

    public TranslateDataModel(@NonNull Language sourceLanguage,
                              @NonNull Language destinationLanguage,
                              String sourceText,
                              String translatedText) {
        this.sourceLanguage = sourceLanguage;
        this.destinationLanguage = destinationLanguage;
        this.sourceText = sourceText;
        this.translatedText = translatedText;
    }

    public Language getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(@NonNull Language sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public Language getDestinationLanguage() {
        return destinationLanguage;
    }

    public void setDestinationLanguage(@NonNull Language destinationLanguage) {
        this.destinationLanguage = destinationLanguage;
    }

    public String getSourceText() {
        return sourceText;
    }

    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }
}
