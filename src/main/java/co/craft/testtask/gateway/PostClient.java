package co.craft.testtask.gateway;

import co.craft.testtask.model.Post;

/**
 * Created by ylauresh on 6/30/16.
 */
public interface PostClient {

    Post getPost(long id);
}
