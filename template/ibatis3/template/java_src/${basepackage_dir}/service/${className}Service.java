<#include"/java_copyright.include">
        <#assign className=table.className>
        <#assign classNameLower=className?uncap_first>
        package ${basepackage}.service;
import ${basepackage}.service.BaseService;
import ${basepackage}.model.${className};

/**
 * ${className}Service接口
 *
 * @version : Ver 1.0
 */
public interface $ {
    className
}Service extends BaseService<${className},${table.idColumn.javaType}>{

        }
