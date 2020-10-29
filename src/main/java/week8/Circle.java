package week8;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author Z
 * @Date 2020/10/29
 **/

public class Circle extends Shape {
    @Override
    public void getName() {
        super.getName();
        System.out.println("this is a Circle class");
    }

    @Override
    public double getArea() {
        return 0;
    }

}
