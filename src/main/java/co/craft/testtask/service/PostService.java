package co.craft.testtask.service;

import co.craft.testtask.model.Post;
import co.craft.testtask.service.exception.PostServiceException;

import java.util.List;

/**
 * Created by ylauresh on 6/30/16.
 */
public interface PostService {

    Post findById(long id) throws PostServiceException;

    List<Post> findAll();
}
