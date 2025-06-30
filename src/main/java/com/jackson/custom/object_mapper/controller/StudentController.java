/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.custom.object_mapper.controller;

import com.jackson.custom.object_mapper.dto.StudentDto;
import com.jackson.custom.object_mapper.model.StudentEntity;
import com.jackson.custom.object_mapper.service.StudentService;
import com.jackson.custom.object_mapper.utilities.model_mapper.NoPermissionObjectMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * StudentController Class.
 * <p>
 * </p>
 *
 * @author
 */

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudentByName")
    public ResponseEntity<?> getStudentByName(@RequestParam("studentName") String studentName) throws NoPermissionObjectMappingException {
        StudentDto student = studentService.getStudentByName(studentName);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

}
