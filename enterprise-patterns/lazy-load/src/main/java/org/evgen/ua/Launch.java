package org.evgen.ua;

import java.util.List;

public class Launch {

    public static void main(String[] args) {
        List<Post> posts = Post.load();
        posts.forEach(post -> {
            System.out.println(post.title);
            System.out.println(post.description);
            System.out.println(post.getTags());
        });
    }
}
