<#assign className=table.className>
        <#assign classNameLower=className?uncap_first>
        package ${basepackage}.dao;

import ${basepackage}.entity.${className};

/**
 * ${className}Dao
 */
public interface $ {
    className
}Dao extends BaseDao<${className},${table.idColumn.javaType}>{

        }
