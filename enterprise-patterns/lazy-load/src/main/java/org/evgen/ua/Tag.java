package org.evgen.ua;

import java.util.Collections;
import java.util.List;

public class Tag {

    public final String name;

    public Tag(String name) {
        this.name = name;
    }

    public static List<Tag> load() {
        return Collections.singletonList(new Tag("java"));
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                '}';
    }
}
