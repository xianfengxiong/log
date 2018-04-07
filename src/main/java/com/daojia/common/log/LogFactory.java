package com.daojia.common.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @author xxf
 * @since 2018/4/7
 */
public final class LogFactory {

  private static final HashMap<String,Logger> cache = new HashMap<String, Logger>();

  private LogFactory() {
  }

  public static Logger getLogger(Class<?> clazz) {
    if (clazz == null) {
      throw new IllegalArgumentException("clazz can not be null");
    }
    return getLogger(clazz.getName());
  }

  public static Logger getLogger(String name) {
    Logger log = cache.get(name);
    if (log == null) {
      synchronized (cache) {
        log = cache.get(name);
        if (log == null) {
          log = newLogger(name);
          cache.put(name,log);
        }
      }
    }
    return log;
  }

  private static Logger newLogger(String name) {
    return new LoggerWrapper(LoggerFactory.getLogger(name));
  }

}
