package com.jackson.custom.object_mapper.utilities.model_mapper;

import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.NotFound;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMappable {

    Class<? extends Mappable>[] targets();

}
