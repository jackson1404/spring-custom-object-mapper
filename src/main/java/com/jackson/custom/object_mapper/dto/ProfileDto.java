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
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ProfileDto Class.
 * <p>
 * </p>
 *
 * @author
 */

@Data
@ValidMappable(targets = {StudentEntity.class})
public class ProfileDto implements Mappable {
}
