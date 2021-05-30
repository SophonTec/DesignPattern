package com.sophon.ocp;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    private void drawRectangle(Shape s) {
        System.out.println("Draw Rectangle");
    }

    private void drawCircle(Shape s) {
        System.out.println("Draw Circle");
    }

    private void drawTriangle(Shape s) {
        System.out.println("Draw Triangle");
    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
