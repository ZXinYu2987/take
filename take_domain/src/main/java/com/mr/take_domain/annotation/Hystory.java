package com.mr.take_domain.annotation;

import java.lang.annotation.*;

/**
 * aop 记录 历史访问记录
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Hystory {
    // descption 描述方法的实际作用
    String description()  default "";
}
