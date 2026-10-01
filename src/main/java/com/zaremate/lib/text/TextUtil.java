package com.zaremate.lib.text;
import net.minecraft.network.chat.Component;
public final class TextUtil {
    private TextUtil() {}
    public static Component text(String value) { return Component.literal(value); }
    public static Component empty() { return Component.empty(); }
    public static Component join(Component separator, Component... parts) {
        Component result = Component.empty();
        for (int i = 0; i < parts.length; i++) {
            if (i > 0) result = result.append(separator);
            result = result.append(parts[i]);
        }
        return result;
    }
}
