package $

{basepackage}.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * mybatis基础Dao
 */
public interface BaseDao<T, PK extends Serializable> {

    /**
     * 按主键查找对象
     */
    public abstract T getById(PK pk);

    /**
     * 获取总记录数
     */
    public abstract int getTotalCount(Map<String, Object> params);

    /**
     * 按实体对象属性动态查找列表
     */
    public abstract List<T> findList(T obj);

    /**
     * 分页
     */
    public abstract List<T> findPageList(Map<String, Object> params);

    /**
     * 保存
     */
    public abstract int save(T obj);

    /**
     * 更新
     */
    public abstract int update(T obj);

    /**
     * 删除
     */
    public abstract int delete(PK pk);

}
	
