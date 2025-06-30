/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.custom.object_mapper.dto;

import com.jackson.custom.object_mapper.model.StudentEntity;
import com.jackson.custom.object_mapper.utilities.model_mapper.Mappable;
import com.jackson.custom.object_mapper.utilities.model_mapper.ValidMappable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * EntityDto Class.
 * <p>
 * </p>
 *
 * @author
 */

public class StudentDto implements Mappable {

    private String studentName;
    private Integer studentAge;
    private String studentAddress;
    private String studentPhoneNumber;

    public StudentDto(){}

    public StudentDto(String studentName, Integer studentAge, String studentAddress, String studentPhoneNumber) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentAddress = studentAddress;
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }
}
