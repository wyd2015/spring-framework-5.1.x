package com.wcg.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: wcg
 * @Date: 2020/2/13 11:21
 */
@Configurable
@ComponentScan("com.wcg.service")
public class AppConfig {
}
