package entity;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import stream.common.DateConstant;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/2/28
 * @see entity <br>
 * @since V1.0<br>
 */
public class AbstractVo implements Serializable {
	private static final long serialVersionUID = 4747982101663782046L;

	@Override
	public String toString() {
		return JSONObject.toJSONStringWithDateFormat(this, DateConstant.DATETIME_FORMAT_19, SerializerFeature.WriteDateUseDateFormat);
	}
}
