package com.zgiot.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface KepServerMapping {
    String DATATYPE_BOOL="BOOL";
    String DATATYPE_INT="INT";
    String DATATYPE_DINT="DINT";
    String READ_ONLY="R";
    String READ_WRITE="RW";

    String dataType() default "";
    String position() default "";
    String description() default "";
    String rwType() default "";
}
