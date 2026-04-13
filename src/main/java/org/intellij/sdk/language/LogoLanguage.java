package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class LogoLanguage extends Language {
    public static final LogoLanguage INSTANCE = new LogoLanguage();

    private LogoLanguage() {
        super("Logo");
    }
}
