package main.producerconsumer;

import java.util.Scanner;

public class ProducerConsumerApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //when empty, threads will keep running.  Calls the method to stop the produce and consume loops when not empty
        String exit = "";

        System.out.println("Starting producer/consumer interaction.  Input anything to stop.");

        MiddleMan middleMan = new main.producerconsumer.MiddleMan();

        //creates producer from produce method in middleman
        Runnable producer = () -> {
            try {
                middleMan.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        //creates consumer from consume method in middleman
        Runnable consumer = () -> {
            try {
                middleMan.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        //places each in a thread and starts those threads
        new Thread(producer).start();
        new Thread(consumer).start();

        //when user provides console input, calls method to end middleman loops
        exit = input.next();

        if (!exit.isEmpty()) {
            middleMan.endInteraction();
        }
    }
}
