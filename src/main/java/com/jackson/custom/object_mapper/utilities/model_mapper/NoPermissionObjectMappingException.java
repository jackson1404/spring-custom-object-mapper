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

public class NoPermissionObjectMappingException extends RuntimeException {

    public NoPermissionObjectMappingException(Class<? extends Mappable> type, Class<? extends Mappable> sourceType) {
        super(classLinkCreator(type) + " has no permission\n\tto map " + classLinkCreator(sourceType));
    }

    private static String classLinkCreator(Class<?> type) {
        return type.getTypeName().replace("." + type.getSimpleName(), "") + "(" + type.getSimpleName() + ".java:0)";
    }
}
