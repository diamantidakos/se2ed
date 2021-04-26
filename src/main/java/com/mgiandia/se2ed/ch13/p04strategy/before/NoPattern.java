package com.mgiandia.se2ed.ch13.p04strategy.before;

public class NoPattern {

    private boolean useQuicksort;
    
    public void doSomething() {
        if (useQuicksort) {
            quickSort();
        } else {
            bubbleSort();
        }
    }
    
    
    private void quickSort() {}
    private void bubbleSort() {}
    
}
