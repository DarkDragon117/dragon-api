package dev.chechu.dragonapi.core.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@AllArgsConstructor
public abstract class Sender <T> {
    @Getter private boolean consoleSender;
    @Getter private boolean commandBlockSender;
    @Getter private boolean playerSender;
    @Getter private T sender;

    /**
     * Sends message to the Sender
     * @param message Message to be sent
     */
    public abstract void sendMessage(@NotNull String message);

    /**
     * Sends actionBar to the Sender if the Sender is a player
     * @param actionBar Action bar to be displayed
     */
    public abstract void sendActionBar(@NotNull String actionBar);

    /**
     * Sends a title to the Sender if the Sender is a player
     * @param title Title to be shown
     * @param subtitle Subtitle to be shown
     */
    public abstract void sendTitle(@NotNull String title, @Nullable String subtitle);

    public abstract String getLocale();
}
