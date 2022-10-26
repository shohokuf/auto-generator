package $

{basepackage}.model;

import java.io.Serializable;

/**
 * model基类
 *
 * @version : Ver 1.0
 */
public class BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 排序字段
     */
    private String sortColumns;

    public String getSortColumns() {
        return sortColumns;
    }

    public void setSortColumns(String sortColumns) {
        this.sortColumns = sortColumns;
    }

}
