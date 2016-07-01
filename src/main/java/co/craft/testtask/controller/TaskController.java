package co.craft.testtask.controller;

import co.craft.testtask.dto.PostDto;
import co.craft.testtask.model.Post;
import co.craft.testtask.service.PostService;
import co.craft.testtask.validation.ValidationUtils;
import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ylauresh on 6/30/16.
 */
@RestController
public class TaskController {

    private static final Logger logger = Logger.getLogger(TaskController.class);

    @Autowired
    PostService postService;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(value="v1/post", method = RequestMethod.GET)
    public @ResponseBody
    List<PostDto> getPosts() {
        List<Post> posts = postService.findAll();
        return posts.stream()
                .map(post -> modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());
    }

    @RequestMapping(value="v1/post/{id}", method = RequestMethod.GET)
    public @ResponseBody  PostDto getPost(@PathVariable("id") long id) throws Exception {
        logger.info(String.format("Start of getPost with id: %d",id));
        ValidationUtils.validateId(id);
        PostDto postDto = modelMapper.map(postService.findById(id), PostDto.class);
        logger.debug(String.format("End of getPost with result: %s", String.valueOf(postDto.toString())));
        return postDto;
    }

}
