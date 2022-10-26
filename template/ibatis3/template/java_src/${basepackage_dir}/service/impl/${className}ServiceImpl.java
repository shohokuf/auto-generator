<#include"/java_copyright.include">
<#assign className=table.className>
<#assign classNameLower=className?uncap_first>
package ${basepackage}.service.impl;
import ${basepackage}.service.${className}Service;
import org.springframework.stereotype.Service;
import ${basepackage}.model.${className};

/**
 * 基本CURD操作在MybatisBaseServiceImpl中实现
 * 否则自行声明接口，实现方法
 */
@Service
public class $ {className}ServiceImpl extends MybatisBaseServiceImpl<${className}, ${table.idColumn.javaType}> implements ${className}Service {

}
