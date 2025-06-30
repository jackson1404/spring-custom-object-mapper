/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.custom.object_mapper.config;

import com.jackson.custom.object_mapper.dto.StudentDto;
import com.jackson.custom.object_mapper.model.StudentEntity;
import com.jackson.custom.object_mapper.utilities.model_mapper.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

/**
 * ModelMapperConfig Class.
 * <p>
 * </p>
 *
 * @author
 */
@Configuration
public class ModelMapperConfig {

    @PostConstruct
    public void configureMappings(){
        ObjectMapper.configure(mapper -> {
            mapper.typeMap(StudentEntity.class, StudentDto.class)
                    .addMappings(m->{
                        m.map(StudentEntity::getStudentName, StudentDto::setStudentAddress);
                    });
        });
    }


}
