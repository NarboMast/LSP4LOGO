package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class LogoFileType extends LanguageFileType {
    public static final LogoFileType INSTANCE = new LogoFileType();

    private LogoFileType() {
        super(LogoLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Logo File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Logo language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "logo";
    }

    @Override
    public @Nullable Icon getIcon() {
        return LogoIcon.FILE_TURTLE_PNG;
    }
}
