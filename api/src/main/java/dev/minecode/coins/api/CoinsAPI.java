package dev.minecode.coins.api;

import dev.minecode.coins.api.manager.FileManager;
import dev.minecode.coins.api.manager.PlayerManager;
import dev.minecode.coins.api.manager.ReplaceManager;
import dev.minecode.core.api.object.CorePlugin;
import dev.minecode.core.api.object.Language;
import dev.minecode.core.api.object.LanguageAbstract;
import net.md_5.bungee.api.chat.BaseComponent;

public abstract class CoinsAPI {

    // Instance
    private static CoinsAPI instance;

    public static CoinsAPI getInstance() {
        return instance;
    }

    public static void setInstance(CoinsAPI coreAPI) {
        CoinsAPI.instance = coreAPI;
    }


    // Manager
    public abstract FileManager getFileManager();

    public abstract PlayerManager getPlayerManager();

    public abstract ReplaceManager getReplaceManager(String message);

    public abstract ReplaceManager getReplaceManager(BaseComponent[] message);

    public abstract ReplaceManager getReplaceManager(Language language, LanguageAbstract path);

    // Getter & Setter
    public abstract CorePlugin getThisCorePlugin();

}
