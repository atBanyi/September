package Extends;

/*
 * 继承的概念
 *             继承是面向对象三大特征之一，可以使得子类具有父类的属性和方法，还可以在子类中重新定义，
 *       以及 追加属性和方法
 *
 * 实现继承的格式
 *           继承通过extends实现 格式：class 子类 extends 父类 { }
 *           举例：class Dog extends Animal { }
 *继承带来的好处
 *           继承可以让类与类之间产生关系，子父类关系，产生子父类后，子类则可以使用父类中非私有的成员
 * */
public class extendRealize {
    public static void main(String[] args) {
        extendRealizeFu f = new extendRealizeFu();
        f.show();
        extendRealizeZi z = new extendRealizeZi();
        z.method();
        z.show();
    }

}
