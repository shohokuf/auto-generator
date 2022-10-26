package cn.org.rapid_framework.generator.main;

import cn.org.rapid_framework.generator.GeneratorFacade;

public class AutoGeneratorMain {
    private final static GeneratorFacade g = new GeneratorFacade();

    public static void generateByTable(String... tableNames) throws Exception {
        if (null != tableNames && tableNames.length > 0) {
            for (String name : tableNames) {
                g.generateByTable(name, "template");
            }
        }
    }

    // 运行main()自动生成 dao、service、model、mapper.xml
    public static void main(String[] args) throws Exception {
        // 生成数组中所有表名对应的代码
        String[] tableNames = new String[]{"cmn_incomet_contract_t"};
        generateByTable(tableNames);
        // 打开文件夹
        // Runtime.getRuntime().exec("cmd.exe /c start "+ GeneratorProperties.getRequiredProperty("outRoot"));
    }

}
