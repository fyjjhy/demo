package entity;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/7/12
 * @see LogRecord <br>
 * @since V1.0<br>
 */
@Getter
@Setter
public class LogRecord extends AbstractVo {

	private static final long serialVersionUID = 4729347559375860778L;

	/** 日志级别 */
	private String severity;

	/** 执行的模块 */
	private String service;

	/** 一条链路唯一的ID */
	private String trace;

	/** 链路中每一环的ID */
	private String span;

	/** 扩展的数据 */
	private String exportable;

	/** 前面一环的SpanID */
	private String pid;

	/** 当前执行的线程 */
	private String thread;

	/** 方法的事务ID */
	private String stackId;

	/** 上级方法的事务ID */
	private String parentStackId;

	/** 执行方法的签名 */
	private String method;

	/** 方法的参数 */
	private String params;

	/** 方法的返回值 */
	private String returnValue;

	/** 执行时间  毫秒 */
	private String consumeTime;

	/** 错误信息 */
	private String exception;

	/** 拦截的标志 BEFORE\ AFTER\ SUCCESS\ FAIL */
	private String rest;
}
