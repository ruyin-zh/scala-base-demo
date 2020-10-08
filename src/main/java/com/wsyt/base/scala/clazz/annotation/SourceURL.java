package com.wsyt.base.scala.clazz.annotation;

/**
 * @author ruyin_zh
 * @date 2020-10-08
 * @title
 * @description
 */
@interface SourceURL {

    String value();

    String mail() default "";
}
