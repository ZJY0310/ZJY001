package week8;

/**
 * @ClassName Shape形状的抽象类
 * @Description TODO
 * @Author Z
 * @Date 2020/10/29
 **/

public abstract class Shape {

    /**
     * 求面积
     * @return
     */
    public abstract double getArea();

    public void getName(){
        System.out.println("this is an abstract class");
    }
}
