package co.craft.testtask.dao;

import co.craft.testtask.model.Post;

import java.util.List;

/**
 * Created by ylauresh on 6/30/16.
 */
public interface PostDao {

    void persist(Post post);

    Post read(long id);

    List<Post> list();
}
