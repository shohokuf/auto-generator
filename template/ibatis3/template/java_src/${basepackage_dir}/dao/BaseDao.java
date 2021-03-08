/*
 * Beijing YESWAY Information Technology Co,Ltd.
 * All rights reserved.
 * 北京九五智驾信息技术股份有限公司
 * <p>MybatisBaseDao.java</p>
 */
package ${basepackage}.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * mybatis基础Dao
 *
 * @version : Ver 1.0
 * @date	: 2015-5-28 下午1:04:46
 */
public interface BaseDao<T, PK extends Serializable> {

	/**
	 * 按主键查找对象
	 * 
	 * @param pk
	 *            主键
	 * @return
	 */
	public abstract T getById(PK pk);

	/**
	 * 获取总记录数
	 * 
	 * @param obj
	 *            实体对象
	 * @return
	 */
	public abstract Long getTotalCount(Map<String, Object> params);
	
	/**
	 * 按实体对象属性动态查找列表
	 * 
	 * @param obj
	 *            实体对象
	 * @return
	 */
	public abstract List<T> findList(T obj);

	/**
	 * 分页
	 * 
	 * @param pageResult
	 *            分页实体bean
	 * @param obj
	 *            实体对象
	 * @return 分页实体对象
	 */
	public abstract List<T> findPageList(Map<String, Object> params);

	/**
	 * 保存
	 * 
	 * @param obj
	 * @return
	 */
	public abstract int save(T obj);
	
	/**
	 * 批量保存
	 *
	 * @param list
	 * @return
	 */
	public int saveBatch(List<T> list);

	/**
	 * 更新
	 * 
	 * @param obj
	 * @return
	 */
	public abstract int update(T obj);

	/**
	 * 删除
	 * 
	 * @param pk
	 * @return
	 */
	public abstract int delete(PK pk);

	/**
	 * 批量删除
	 * 
	 * @param list
	 * @return
	 */
	public abstract int deleteBatch(List<String> list);
	
}
	
