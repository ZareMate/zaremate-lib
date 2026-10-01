package com.zaremate.lib.player;
import net.minecraft.server.level.ServerPlayer;
import java.util.Locale;
public final class PlayerUtil {
    private PlayerUtil() {}
    public static String username(ServerPlayer player) { return player.getGameProfile().name(); }
    public static String normalizedUsername(ServerPlayer player) { return username(player).toLowerCase(Locale.ROOT); }
    public static String uuid(ServerPlayer player) { return player.getUUID().toString(); }
}
