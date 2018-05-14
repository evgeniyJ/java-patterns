package org.evgen.ua;

import java.util.Objects;
import java.util.function.Supplier;

public class ValueHolder<T> {

    private T value;
    private final Supplier<T> loader;

    public ValueHolder(Supplier<T> loader) {
        this.loader = loader;
    }

    public T get() {
        if (Objects.isNull(value)) {
            value = loader.get();
        }
        return value;
    }
}
