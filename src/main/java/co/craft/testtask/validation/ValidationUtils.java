package co.craft.testtask.validation;

import co.craft.testtask.service.exception.PostServiceException;

/**
 * Created by ylauresh on 7/1/16.
 */
public class ValidationUtils {

    public static void validateId(long id) throws PostServiceException {
        if(id<=0){
            throw new PostServiceException("Invalide id. Id value should be greather than 0", PostServiceException.ErrorCode.BAD_REQUEST);
        }
    }
}
