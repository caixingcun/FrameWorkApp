package com.example.frameworkapp.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 布局注解
 *   //@InjectLayout(id=R.layout.xxx)
 *   public class WelcomeActivity extends AppCompatActivity {}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectLayout {
    int value();
}