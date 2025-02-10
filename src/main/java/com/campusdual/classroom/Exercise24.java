package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {

    public static Queue<String> createQueue() {

        Queue<String> queue = new LinkedList<>();
        queue.add("Smith");
        queue.add("Montessori");
        queue.add("Peralta");
        queue.add("House");

        return queue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            // Muestra el elemento en la cima y lo elimina
            System.out.println(queue.poll());
        }
    }
    public static void main(String[] args) {
            printAndEmptyQueue(createQueue());
        }

}
