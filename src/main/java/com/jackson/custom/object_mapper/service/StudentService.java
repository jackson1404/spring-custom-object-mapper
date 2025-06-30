/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.custom.object_mapper.service;

import com.jackson.custom.object_mapper.dto.StudentDto;
import com.jackson.custom.object_mapper.model.StudentEntity;
import com.jackson.custom.object_mapper.utilities.model_mapper.NoPermissionObjectMappingException;

/**
 * StudentService Class.
 * <p>
 * </p>
 *
 * @author
 */
public interface StudentService {

    StudentDto getStudentByName(String studentName);




}
