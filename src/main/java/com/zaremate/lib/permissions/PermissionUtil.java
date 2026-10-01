package com.zaremate.lib.permissions;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.level.ServerPlayer;
public final class PermissionUtil {
    private PermissionUtil() {}
    public static boolean has(CommandSourceStack source, int level) { return source.hasPermission(level); }
    public static boolean has(ServerPlayer player, int level) { return player.hasPermissions(level); }
}
