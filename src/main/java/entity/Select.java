package entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月07日 <br>
 * @see com.hbasesoft.vcc.sgp.ability.manager.server.bean <br>
 * @since V1.0 <br>
 */
public class Select extends AbstractVo {

    private static final long serialVersionUID = -6190986610931999759L;

    private String dataCode;

    private String dataName;

    public String getDataCode() {
        return dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Select select = (Select) o;
        return Objects.equals(dataCode, select.dataCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dataCode);
    }
}
