<#assign className=table.className>
<#assign classNameLower=className?uncap_first>
package ${basepackage}.service;

import ${basepackage}.service.BaseService;
import ${basepackage}.entity.${className};

/**
 * ${className}Service接口
 */
public interface $ {className}Service extends BaseService<${className}, ${table.idColumn.javaType}> {

}
