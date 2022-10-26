package ${basepackage}.service;

import java.io.Serializable;
import java.util.List;

import ${basepackage}.dto.Pager;

/**
 * service基础类
 */
public interface BaseService<T, PK extends Serializable> {

    /**
     * 按主键查找对象
     *
     * @param pk   主键
     * @param clzz 实体bean
     * @return
     */
    T getById(PK pk);

    /**
     * 获取总记录数
     *
     * @param obj 实体对象
     * @return
     */
    Long getTotalCount(T obj);

    /**
     * 按实体对象属性动态查找列表
     *
     * @param obj 实体对象
     * @return
     */
    List<T> findList(T obj);

    /**
     * 分页
     *
     * @param pageResult 分页实体bean
     * @param obj        实体对象
     * @return 分页实体对象
     */
    Pager findPageList(T obj, Pager pager);

    /**
     * 保存
     *
     * @param obj
     * @return
     */
    int save(T obj);

    /**
     * 批量保存
     *
     * @param list 实体bean集合
     * @param clzz 实体类
     * @return
     */
    int saveBatch(List<T> list);

    /**
     * 更新
     *
     * @param obj
     * @return
     */
    int update(T obj);

    /**
     * 删除
     *
     * @param pk
     * @param clzz 实体bean
     * @return
     */
    int delete(PK pk);

    /**
     * 批量删除
     *
     * @param list
     * @param clzz 实体bean
     * @return
     */
    int deleteBatch(List<String> list);

}
