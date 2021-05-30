package com.sophon.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }
}

class Other extends Shape {
    Other() {
        super.m_type = 4;
    }


    @Override
    public void draw() {
        System.out.println("Draw Other Shape");
    }
}
