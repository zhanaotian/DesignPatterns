package jkwar.code.builder;


public class BuilderTest {
    public static void main(String[] args) {
        // 封装构建过程, 4 核, 内存 16GB, Mac 系统
        Builder builder=new MacbookBuilder().buildBoard("英特尔主板")
                .buildDisplay("16g")
                .buildOS();
        System.out.println(builder.create().toString());
        Builder builder1=new MicrosoftBuilder().buildBoard("英特尔主板")
                .buildDisplay("20g")
                .buildOS();
        System.out.println(builder1.create().toString());
    }
}
