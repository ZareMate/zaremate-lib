package com.zaremate.lib.config;
import java.util.Objects;
import java.util.function.Supplier;
public final class ConfigValue<T> implements Supplier<T> {
    private final Supplier<T> supplier;
    public ConfigValue(Supplier<T> supplier) { this.supplier = Objects.requireNonNull(supplier); }
    @Override public T get() { return supplier.get(); }
}
