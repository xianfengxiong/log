package com.daojia.common.log;

import org.slf4j.Logger;
import org.slf4j.Marker;

import static com.daojia.common.log.RequestIdHolder.currentRequestId;

/**
 * @author xxf
 * @since 2018/4/7
 */
public class LoggerWrapper implements Logger {

  private static final String request_id = "requestId={},";

  private Logger delegate;

  public LoggerWrapper(Logger delegate) {
    this.delegate = delegate;
  }

  private String appendRequestId(String format) {
    return request_id + format;
  }

  public String getName() {
    return delegate.getName();
  }

  public boolean isTraceEnabled() {
    return delegate.isTraceEnabled();
  }

  public void trace(String msg) {
    delegate.trace(appendRequestId(msg),currentRequestId());
  }

  public void trace(String format, Object arg) {
    delegate.trace(appendRequestId(format),currentRequestId(),arg);
  }

  public void trace(String format, Object arg1, Object arg2) {
    delegate.trace(appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void trace(String format, Object... arguments) {
    delegate.trace(appendRequestId(format),currentRequestId(),arguments);
  }

  public void trace(String msg, Throwable t) {
    delegate.trace(appendRequestId(msg),currentRequestId(),t);
  }

  public boolean isTraceEnabled(Marker marker) {
    return delegate.isTraceEnabled(marker);
  }

  public void trace(Marker marker, String msg) {
    delegate.trace(marker,appendRequestId(msg),currentRequestId());
  }

  public void trace(Marker marker, String format, Object arg) {
    delegate.trace(marker,appendRequestId(format),currentRequestId(),arg);
  }

  public void trace(Marker marker, String format, Object arg1, Object arg2) {
    delegate.trace(marker,appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void trace(Marker marker, String format, Object... argArray) {
    delegate.trace(marker,appendRequestId(format),currentRequestId(),argArray);
  }

  public void trace(Marker marker, String msg, Throwable t) {
    delegate.trace(marker,appendRequestId(msg),currentRequestId(),t);
  }

  public boolean isDebugEnabled() {
    return delegate.isDebugEnabled();
  }

  public void debug(String msg) {
    delegate.debug(appendRequestId(msg),currentRequestId());
  }

  public void debug(String format, Object arg) {
    delegate.debug(appendRequestId(format),currentRequestId(),arg);
  }

  public void debug(String format, Object arg1, Object arg2) {
    delegate.debug(appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void debug(String format, Object... arguments) {
    delegate.debug(appendRequestId(format),currentRequestId(),arguments);
  }

  public void debug(String msg, Throwable t) {
    delegate.debug(appendRequestId(msg),currentRequestId(),t);
  }

  public boolean isDebugEnabled(Marker marker) {
    return delegate.isDebugEnabled(marker);
  }

  public void debug(Marker marker, String msg) {
    delegate.debug(marker,appendRequestId(msg),currentRequestId());
  }

  public void debug(Marker marker, String format, Object arg) {
    delegate.debug(marker,appendRequestId(format),currentRequestId(),arg);
  }

  public void debug(Marker marker, String format, Object arg1, Object arg2) {
    delegate.debug(marker,appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void debug(Marker marker, String format, Object... argArray) {
    delegate.debug(marker,appendRequestId(format),currentRequestId(),argArray);
  }

  public void debug(Marker marker, String msg, Throwable t) {
    delegate.debug(marker,appendRequestId(msg),currentRequestId(),t);
  }

  public boolean isInfoEnabled() {
    return delegate.isInfoEnabled();
  }

  public void info(String msg) {
    delegate.info(appendRequestId(msg),currentRequestId());
  }

  public void info(String format, Object arg) {
    delegate.info(appendRequestId(format),currentRequestId(),arg);
  }

  public void info(String format, Object arg1, Object arg2) {
    delegate.info(appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void info(String format, Object... arguments) {
    delegate.info(appendRequestId(format),currentRequestId(),arguments);
  }

  public void info(String msg, Throwable t) {
    delegate.info(appendRequestId(msg),currentRequestId(),t);
  }

  public boolean isInfoEnabled(Marker marker) {
    return delegate.isInfoEnabled(marker);
  }

  public void info(Marker marker, String msg) {
    delegate.info(marker,appendRequestId(msg),currentRequestId());
  }

  public void info(Marker marker, String format, Object arg) {
    delegate.info(marker,appendRequestId(format),currentRequestId(),arg);
  }

  public void info(Marker marker, String format, Object arg1, Object arg2) {
    delegate.info(marker,appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void info(Marker marker, String format, Object... argArray) {
    delegate.info(marker,appendRequestId(format),currentRequestId(),argArray);
  }

  public void info(Marker marker, String msg, Throwable t) {
    delegate.info(marker,appendRequestId(msg),currentRequestId(),t);
  }

  public boolean isWarnEnabled() {
    return delegate.isWarnEnabled();
  }

  public void warn(String msg) {
    delegate.warn(appendRequestId(msg),currentRequestId());
  }

  public void warn(String format, Object arg) {
    delegate.warn(appendRequestId(format),currentRequestId(),arg);
  }

  public void warn(String format, Object arg1, Object arg2) {
    delegate.warn(appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void warn(String format, Object... arguments) {
    delegate.warn(appendRequestId(format),currentRequestId(),arguments);
  }

  public void warn(String msg, Throwable t) {
    delegate.warn(appendRequestId(msg),currentRequestId(),t);
  }

  public boolean isWarnEnabled(Marker marker) {
    return delegate.isWarnEnabled(marker);
  }

  public void warn(Marker marker, String msg) {
    delegate.warn(marker,appendRequestId(msg),currentRequestId());
  }

  public void warn(Marker marker, String format, Object arg) {
    delegate.warn(marker,appendRequestId(format),currentRequestId(),arg);
  }

  public void warn(Marker marker, String format, Object arg1, Object arg2) {
    delegate.warn(marker,appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void warn(Marker marker, String format, Object... argArray) {
    delegate.warn(marker,appendRequestId(format),currentRequestId(),argArray);
  }

  public void warn(Marker marker, String msg, Throwable t) {
    delegate.warn(marker,appendRequestId(msg),currentRequestId(),t);
  }

  public boolean isErrorEnabled() {
    return delegate.isErrorEnabled();
  }

  public void error(String msg) {
    delegate.error(appendRequestId(msg),currentRequestId());
  }

  public void error(String format, Object arg) {
    delegate.error(appendRequestId(format),currentRequestId(),arg);
  }

  public void error(String format, Object arg1, Object arg2) {
    delegate.error(appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void error(String format, Object... arguments) {
    delegate.error(appendRequestId(format),currentRequestId(),arguments);
  }

  public void error(String msg, Throwable t) {
    delegate.error(appendRequestId(msg),currentRequestId(),t);
  }

  public boolean isErrorEnabled(Marker marker) {
    return delegate.isErrorEnabled(marker);
  }

  public void error(Marker marker, String msg) {
    delegate.error(marker,appendRequestId(msg),currentRequestId());
  }

  public void error(Marker marker, String format, Object arg) {
    delegate.error(marker,appendRequestId(format),currentRequestId(),arg);
  }

  public void error(Marker marker, String format, Object arg1, Object arg2) {
    delegate.error(marker,appendRequestId(format),currentRequestId(),arg1,arg2);
  }

  public void error(Marker marker, String format, Object... argArray) {
    delegate.error(marker,appendRequestId(format),currentRequestId(),argArray);
  }

  public void error(Marker marker, String msg, Throwable t) {
    delegate.error(marker,appendRequestId(msg),currentRequestId(),t);
  }

}
