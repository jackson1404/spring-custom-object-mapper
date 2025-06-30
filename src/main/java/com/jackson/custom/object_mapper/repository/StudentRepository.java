/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.custom.object_mapper.repository;

import com.jackson.custom.object_mapper.dto.StudentDto;
import com.jackson.custom.object_mapper.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * StudentRepository Class.
 * <p>
 * </p>
 *
 * @author
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    @Query("SELECT s FROM StudentEntity s WHERE LOWER(s.studentName) = LOWER(:studentName)")
    StudentEntity findStudentByName(@RequestParam("studentName") String studentName);
}
