package cn.org.rapid_framework.generator.main;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * 运行main()自动生成 dao、service、model、mapper.xml
 */
public class AutoGeneratorMain {
    private final static GeneratorFacade g = new GeneratorFacade();

    /**
     * 生成数组中所有表名对应的
     */
    public static void generateByTable(String... tableNames) throws Exception {
        if (null != tableNames && tableNames.length > 0) {
            for (String tbname : tableNames) {
                g.generateByTable(tbname, "template");
            }
        }
    }

    public static void main(String[] args) throws Exception {

        //sql server下生成所有表有bug,用下面sql查询出所有表，copy到下面数据中批量生成
//		SELECT STUFF((select ',"' + name +'"' from sysobjects where xtype='u' for xml path('')),1,1,'')

        // 生成数组中所有表名对应的代码
        String[] tableNames = new String[]{"bs_sheet_res_config"};
        generateByTable(tableNames);
        // 打开文件夹
        // Runtime.getRuntime().exec("cmd.exe /c start "+ GeneratorProperties.getRequiredProperty("outRoot"));
    }

}
