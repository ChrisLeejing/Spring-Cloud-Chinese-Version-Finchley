package com.chris.starter.client;

import com.chris.starter.config.UserAutoConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/14 16:51
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(UserAutoConfigure.class)
public @interface EnableUserClient {
}
