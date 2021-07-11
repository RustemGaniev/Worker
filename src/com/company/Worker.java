package com.company;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;


    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        OnTaskErrorListener errorCallback = System.out :: println;
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Error !!! Task " + i + " has broken ");
            } else {
                callback.oneDone("Task " + i + " is done");
            }
        }
    }
}
