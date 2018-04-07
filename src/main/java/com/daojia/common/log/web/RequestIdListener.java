package com.daojia.common.log.web;

import com.daojia.common.log.RequestIdHolder;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.UUID;

/**
 * @author xxf
 * @since 2018/4/7
 */
@WebListener("requestIdListener")
public class RequestIdListener implements ServletRequestListener {

  public void requestInitialized(ServletRequestEvent servletRequestEvent) {
    String id = UUID.randomUUID().toString();
    RequestIdHolder.setRequestId(id);
  }

  public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
    RequestIdHolder.clear();
  }
}
