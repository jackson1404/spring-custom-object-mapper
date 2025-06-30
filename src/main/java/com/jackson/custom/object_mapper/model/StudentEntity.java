/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.custom.object_mapper.model;

import com.jackson.custom.object_mapper.dto.ProfileDto;
import com.jackson.custom.object_mapper.dto.StudentDto;
import com.jackson.custom.object_mapper.utilities.model_mapper.Mappable;
import com.jackson.custom.object_mapper.utilities.model_mapper.ValidMappable;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Profile;

/**
 * StudentEntity Class.
 * <p>
 * </p>
 *
 * @author
 */
@Data
@Entity
@Table(name = "tbl_students")
@ValidMappable(targets = {StudentDto.class, ProfileDto.class})
public class StudentEntity implements Mappable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private Integer studentAge;
    private String studentAddress;
    private String studentPhoneNumber;


}
