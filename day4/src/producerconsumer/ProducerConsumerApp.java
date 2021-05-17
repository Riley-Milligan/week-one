package main.producerconsumer;

import java.util.Scanner;

public class ProducerConsumerApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String exit = "";

        System.out.println("Starting producer/consumer interaction.  Input anything to stop.");

        main.producerconsumer.MiddleMan middleMan = new main.producerconsumer.MiddleMan();

        Runnable producer = () -> {
            try {
                middleMan.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumer = () -> {
            try {
                middleMan.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();

        exit = input.next();

        if (!exit.isEmpty()) {
            middleMan.endInteraction();
        }
    }
}
