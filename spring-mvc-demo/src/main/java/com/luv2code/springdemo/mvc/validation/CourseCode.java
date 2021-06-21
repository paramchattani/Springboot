package com.luv2code.springdemo.mvc.validation;
import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
public String value() default "PRM";
public String message() default "must start it PRM";
public Class<?>[] groups() default {};
public Class<? extends Payload>[] payload() default{};
}
