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

            Queue<String> queue = createQueue();

            // Crear y poblar la cola
            createQueue();

            // Comprobar el elemento en la cima de la cola
            System.out.println("Elemento en la cima de la cola: " + queue.peek());

            // Recorrer y vaciar la cola mostrando los elementos
            System.out.println("Elementos de la cola:");
            printAndEmptyQueue(queue);
        }

}
