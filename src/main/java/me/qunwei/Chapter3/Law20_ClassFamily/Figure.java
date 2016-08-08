package me.qunwei.Chapter3.Law20_ClassFamily;

/**
 * Created by QunWei on 2016/8/8.
 */


/**
 * 类层次, 反映类型本质上的层次关系, 有助于增强灵活性.
 *
 * 例: 圆 和 长方形 是属于 图形的概念, 正方形是特殊的长方形
 */
public abstract class Figure {
    abstract double ares();
}

class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double ares() {
        return Math.PI * (radius * radius);
    }
}

class Rectangle extends Figure {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double ares() {
        return length * width;
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
}