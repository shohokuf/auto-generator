<#include "/macro.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>

public class ${className} {
    <#list table.columns as column>

    /**
     * ${column.remarks}
     * ${column.sqlName} ${column.sqlTypeName}(${column.size})
     */
    private ${column.javaType} ${column.columnNameLower};
    <#if column.isDateTimeColumn>
    </#if>
    </#list>
    <@generateJavaColumns/>
}
<#macro generateJavaColumns>

</#macro>
<#macro generateJavaOneToMany>

</#macro>
<#macro generateJavaManyToOne>

</#macro>
