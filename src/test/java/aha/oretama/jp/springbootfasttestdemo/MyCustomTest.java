package aha.oretama.jp.springbootfasttestdemo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.OverrideAutoConfiguration;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.filter.TypeExcludeFilters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.BootstrapWith;

/**
 * @author sekineyasufumi on 2017/11/16.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@BootstrapWith(SpringBootTestContextBootstrapper.class)
@OverrideAutoConfiguration(
    enabled = false
)
@TypeExcludeFilters({MyCustomTypeExcludeFilter.class})
@AutoConfigureCache
@AutoConfigureWebMvc
@AutoConfigureMockMvc
@ImportAutoConfiguration
public @interface MyCustomTest {
    Class<?>[] value() default {};

    boolean useDefaultFilters() default true;

    ComponentScan.Filter[] includeFilters() default {};

    ComponentScan.Filter[] excludeFilters() default {};

    @AliasFor(
        annotation = AutoConfigureMockMvc.class,
        attribute = "secure"
    )
    boolean secure() default true;

    @AliasFor(
        annotation = ImportAutoConfiguration.class,
        attribute = "exclude"
    )
    Class<?>[] excludeAutoConfiguration() default {};
}

