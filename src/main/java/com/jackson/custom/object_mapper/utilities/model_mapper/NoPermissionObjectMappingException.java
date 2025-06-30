/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.custom.object_mapper.utilities.model_mapper;

/**
 * NoPermissionObjectMappingException Class.
 * <p>
 * </p>
 *
 * @author
 */

public class NoPermissionObjectMappingException extends Throwable {
    public <D extends Mappable> NoPermissionObjectMappingException(Class<D> destinationType, Class<? extends Mappable> aClass) {
    }
}
