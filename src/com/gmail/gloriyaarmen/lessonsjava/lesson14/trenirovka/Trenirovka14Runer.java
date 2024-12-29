package com.gmail.gloriyaarmen.lessonsjava.lesson14.trenirovka;

import static com.gmail.gloriyaarmen.lessonsjava.lesson14.trenirovka.Triangle.EDGE_COUNT;

public class Trenirovka14Runer {
    public static void main(String[] args) {
        System.out.println("Created edges: " + Triangle.Edge.getCreatedInstances());
        int createdEdges = 17;
        int[] sides = {3, 4, 5};
        Triangle.Edge blueEdge = new Triangle.Edge(5, "blue");

        class BoldEdge extends Triangle.Edge {
            public BoldEdge(int lenght, String color) {
                super(lenght, color);
            }

//            public void outerVariable() {
//                System.out.println("Outer variable value == " + createdEdges);//local variables referenced from an inner class must be final or effectively final
//            }                                                                 //локальные переменные, на которые ссылаются из внутреннего класса, должны быть final или фактически final

            @Override
            public String toString() {
                return "BoldEdge{" + super.toString() + "}";
            }
        }

        BoldEdge boldEdge = new BoldEdge(4,"green");
        Triangle triangle = new Triangle(new Triangle.Edge[] {
                new Triangle.Edge(3, "black"),
                new BoldEdge(4, "green"),
                boldEdge,
                blueEdge
        });
        createdEdges += 3;
//        boldEdge.outerVariable();
        System.out.println(triangle);

        sides[1] = 7;
        System.out.println(triangle);
        System.out.println("Created edges: " + Triangle.Edge.getCreatedInstances());

        Triangle.Edge.outerField();
        System.out.println("Triangle must have " + EDGE_COUNT + " sides");
    }
}