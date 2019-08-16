package entity;

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

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public String getSpan() {
		return span;
	}

	public void setSpan(String span) {
		this.span = span;
	}

	public String getExportable() {
		return exportable;
	}

	public void setExportable(String exportable) {
		this.exportable = exportable;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public String getStackId() {
		return stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
	}

	public String getParentStackId() {
		return parentStackId;
	}

	public void setParentStackId(String parentStackId) {
		this.parentStackId = parentStackId;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}

	public String getConsumeTime() {
		return consumeTime;
	}

	public void setConsumeTime(String consumeTime) {
		this.consumeTime = consumeTime;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getRest() {
		return rest;
	}

	public void setRest(String rest) {
		this.rest = rest;
	}
}
