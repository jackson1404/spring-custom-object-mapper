/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.custom.object_mapper.service.serviceImpl;

import com.jackson.custom.object_mapper.dto.ProfileDto;
import com.jackson.custom.object_mapper.dto.StudentDto;
import com.jackson.custom.object_mapper.model.StudentEntity;
import com.jackson.custom.object_mapper.repository.StudentRepository;
import com.jackson.custom.object_mapper.service.StudentService;
import com.jackson.custom.object_mapper.utilities.model_mapper.NoPermissionObjectMappingException;
import com.jackson.custom.object_mapper.utilities.model_mapper.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * StudentServiceImpl Class.
 * <p>
 * </p>
 *
 * @author
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDto getStudentByName(String studentName)   {
        StudentEntity student = studentRepository.findStudentByName(studentName);
        return ObjectMapper.map(student, StudentDto.class);
    }
}
