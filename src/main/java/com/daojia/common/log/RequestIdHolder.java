package com.daojia.common.log;

/**
 * @author xxf
 * @since 2018/4/7
 */
public abstract class RequestIdHolder {

  private static final ThreadLocal<String> holder = new ThreadLocal<String>();

  public static String currentRequestId() {
    return holder.get();
  }

  public static void setRequestId(String requestId) {
    if (requestId == null || requestId.length() <= 0) {
      holder.remove();
    } else {
      holder.set(requestId);
    }
  }

  public static void clear() {
    holder.remove();
  }

}
