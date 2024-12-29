package com.gmail.gloriyaarmen.lessonsjava.lesson14.trenirovka;

import java.util.Arrays;

public class Triangle {
    //    private final int[] sides;   /*public static*/
//    private String[] colors;
//
//    public Triangle(int[] sides) {
//        this.sides = Arrays.copyOf(sides, sides.length);//sides;
//    }
    public static final int EDGE_COUNT = 3;
    private Edge[] edges;

    public Triangle(Edge[] edges) {
        this.edges = Arrays.copyOf(edges, edges.length);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edges=" + Arrays.toString(edges) +
                '}';
    }

    public static class Edge {
        private static int createdInstances = 0;
        private int length;
        private String color;

        public Edge(int length, String color) {
            createdInstances++;
            this.length = length;
            this.color = color;
        }

        public static int getCreatedInstances() {
            return createdInstances;
        }

        public static void outerField() {
            System.out.println("Triangle must have " + EDGE_COUNT + " sides");
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "length=" + length +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}