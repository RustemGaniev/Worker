package com.company;

@FunctionalInterface
public interface OnTaskErrorListener {

    public void onError(String result);
}
