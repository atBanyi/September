package File;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File f = new File("myFile\\java.txt");
//       测试file是否为文件
        System.out.println(f.isFile());
//        测试file是否存在
        System.out.println(f.exists());
//        测试file是否为目录
        System.out.println(f.isDirectory());
//        返回抽象对象的绝对路径
        System.out.println(f.getAbsoluteFile());
//        将抽象路径转化为路径名字符串
        System.out.println(f.getPath());
//返回此抽象路径表示的文件或目录名称
        System.out.println(f.getName());

        System.out.println("-------------------------");

//
        File f2 = new File("D:\\itcast");
        String[] strArray = f2.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("--------------------------");
        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
            System.out.println(file);
        }
    }
}
