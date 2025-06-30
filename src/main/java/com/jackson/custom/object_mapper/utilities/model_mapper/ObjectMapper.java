/***************************************************************
 * Author       :
 * Created Date :
 * Version      :
 * History  :
 * *************************************************************/
package com.jackson.custom.object_mapper.utilities.model_mapper;

import com.jackson.custom.object_mapper.dto.StudentDto;
import org.modelmapper.ModelMapper;

import java.util.Arrays;

/**
 * ObjectMapper Class.
 * <p>
 * </p>
 *
 * @author
 */

public final class ObjectMapper {

    private ObjectMapper(){}

    public static final ModelMapper modelMapper = new ModelMapper();

    public static <S extends Mappable, D extends Mappable> D map(S source, Class<D> destinationType) throws NoPermissionObjectMappingException {
        if (source == null || destinationType == null) return null;
        if(!source.getClass().isAnnotationPresent(ValidMappable.class) || !Arrays.stream(source.getClass().getAnnotation(ValidMappable.class).targets()).toList().contains(destinationType)) throw new NoPermissionObjectMappingException(destinationType, source.getClass());
        return modelMapper.map(source, destinationType);
    }


}
