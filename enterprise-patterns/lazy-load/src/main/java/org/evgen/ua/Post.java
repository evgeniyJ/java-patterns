package org.evgen.ua;

import java.util.Collections;
import java.util.List;

public class Post {

    public final String title;
    public final String description;
    private final ValueHolder<List<Tag>> tags = new ValueHolder<>(Tag::load);

    public List<Tag> getTags() {
        return tags.get();
    }

    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static List<Post> load() {
        return Collections.singletonList(new Post("Java 12", "Removed modules"));
    }
}
