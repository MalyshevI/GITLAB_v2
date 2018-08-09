package com;

import org.junit.Test;

public class Lambda0 {


    /**
     * Complete test and  console output like this:
     * -> Run Before
     * -> Run After
     */
    @Test
    public void testRun() {
        runLater(() -> {
            System.out.println("Run Before " + Thread.currentThread().getName());
        }).run();
    }


    public Runnable runLater(Runnable runnable) {
        return () -> {
            runnable.run();
            System.out.println("Run After " + Thread.currentThread().getName());
        };
    }

}
