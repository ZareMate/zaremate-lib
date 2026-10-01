package com.zaremate.lib.minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import java.util.Optional;
public final class MinecraftUtil {
    private MinecraftUtil() {}
    public static Optional<ServerPlayer> findPlayer(MinecraftServer server, String name) {
        return Optional.ofNullable(server.getPlayerList().getPlayerByName(name));
    }
    public static int onlinePlayers(MinecraftServer server) {
        return server.getPlayerList().getPlayerCount();
    }
}
