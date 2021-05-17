package main.producerconsumer;

import java.util.LinkedList;

//"Middleman" defines how the producer and consumer interact
public class MiddleMan {

    public LinkedList<Integer> buffer = new LinkedList<>();
    Integer boundary = 5;
    String exit = "";

    public void endInteraction() {
        this.exit = "exit";
    }

    public void produce() throws InterruptedException {

        Integer itemNumber = 0;

        //keeps the thread running indefinitely
        while (exit.isEmpty()) {
            synchronized (this) {

                //does not add items while the buffer is full
                while (buffer.size() == boundary) {
                    wait();
                }

                System.out.println("Producer added " + itemNumber + " to the queue.");

                //adds new item to the buffer
                buffer.add(itemNumber);
                itemNumber++;

                //lets the consumer know that there are new items in the buffer
                notify();

                //waits one second before attempting to add new items to buffer
                //Basically to make it easier for me to watch the logging
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {

        Integer itemNumber;

        while (exit.isEmpty()) {
            synchronized (this) {

                //does not consume items when buffer is full
                while (buffer.size() == 0) {
                    wait();
                }

                //Retrieves an item from the queue, then removes it from the queue.
                itemNumber = buffer.getFirst();
                buffer.remove(itemNumber);
                System.out.println("Consumer removed item " + itemNumber + " from queue." );

                //lets the producer know that it can begin producing again
                notify();

                //waits one second before attempting to consume a new item
                //Basically to make it easier for me to watch the logging
                Thread.sleep(1000);
            }
        }
    }

}
