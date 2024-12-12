package com.habuma.restfun;

import org.springframework.context.annotation.*;


@Configuration
public class MagicConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

    /**
     * 具体实现使用了 ProfileCondition
     * @see org.springframework.context.annotation.ProfileCondition
     * @return
     */
    @SuppressWarnings("JavadocReference")
    @Profile("dev")
    @Bean
    public UserBean userBean() {
        return new UserBean();
    }

}
