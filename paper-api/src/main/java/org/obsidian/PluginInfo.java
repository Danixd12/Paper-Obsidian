package org.obsidian;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PluginInfo {

    public String name() default "No name plugin";

    public String author() default "No author";

    public String version() default "0.0.0";

    public String description() default "No description";

    public String web() default "No web";

}
