package com.zaremate.lib.command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
public final class CommandUtil {
    private CommandUtil() {}
    public static int permissionLevel(CommandSourceStack source) {
        for (int level = 4; level >= 0; level--) if (source.hasPermission(level)) return level;
        return 0;
    }
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher,
                                 LiteralArgumentBuilder<CommandSourceStack> command) {
        dispatcher.register(command);
    }
}
