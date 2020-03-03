package com.funnydevs.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@Target(value = METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface OnDetach {
}
