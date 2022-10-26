/*
 * Beijing YESWAY Information Technology Co,Ltd.
 * All rights reserved.
 * 北京九五智驾信息技术股份有限公司
 * <p>MybatisBaseServiceImpl.java</p>
 */
package $

{basepackage}.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${basepackage}.dao.BaseDao;
import ${basepackage}.dto.Pager;
import ${basepackage}.service.BaseService;

/**
 * service基础实现类
 *
 * @version : Ver 1.0
 */

@Service
public class MybatisBaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

    @Autowired
    private BaseDao<T, PK> baseDao;

    @Override
    public T getById(PK pk) {
        return baseDao.getById(pk);
    }

    @Override
    public Long getTotalCount(T obj) {
        if (null == obj) {
            throw new NullPointerException("entity bean is null");
        }

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("model", obj);

        return baseDao.getTotalCount(params);
    }

    @Override
    public List<T> findList(T obj) {
        if (null == obj) {
            throw new NullPointerException("entity bean is null");
        }

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("model", obj);

        return baseDao.findList(obj);
    }

    @Override
    public Pager findPageList(T obj, Pager pager) {
        if (null == pager) {
            throw new NullPointerException("pager bean is null");
        }
        if (null == obj) {
            throw new NullPointerException("entity bean is null");
        }

        if (pager.getTotal() > 0) {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("pageSize", pager.getPageSize());
            params.put("offset", (pager.getPageNumber() - 1) * pager.getPageSize());
            params.put("model", obj);

            List<T> list = baseDao.findPageList(params);

            pager.setDatas(list); // 数据库集合
        }

        return pager;
    }

    @Override
    public int save(T obj) {
        if (null == obj) {
            throw new NullPointerException("entity bean is null");
        }

        return baseDao.save(obj);
    }

    @Override
    public int saveBatch(List<T> list) {
        return baseDao.saveBatch(list);
    }

    @Override
    public int update(T obj) {
        if (null == obj) {
            throw new NullPointerException("entity bean is null");
        }

        return baseDao.update(obj);
    }

    @Override
    public int delete(PK pk) {

        return baseDao.delete(pk);
    }

    @Override
    public int deleteBatch(List<String> list) {
        return baseDao.deleteBatch(list);
    }
}
