package com.yulits;

import java.util.Stack;

public class TowerOfHanoi {

    Stack<Integer> pegA = new Stack<Integer>();
    Stack<Integer> pegB = new Stack<Integer>();
    Stack<Integer> pegC = new Stack<Integer>();


    public void printTowerOfHanoi() {

        System.out.println("");
        System.out.println("PegA: " + this.pegA);
        System.out.println("PegB: " + this.pegB);
        System.out.println("PegC: " + this.pegC);

    }

    public void moveDisk(Stack<Integer> fromPeg, Stack<Integer> toPeg) {
        int disk = fromPeg.pop();
        toPeg.push(disk);
        printTowerOfHanoi();
    }

    public void moveDisks(int numDisks, Stack<Integer> fromPeg, Stack<Integer> toPeg, Stack<Integer> sparePeg) {

        if (numDisks == 2) {
            moveDisk(fromPeg, sparePeg);
            moveDisk(fromPeg, toPeg);
            moveDisk(sparePeg, toPeg);
        }
        else {
            moveDisks(numDisks-1, fromPeg, sparePeg, toPeg);
            moveDisk(fromPeg, toPeg);
            moveDisks(numDisks-1, sparePeg, toPeg, fromPeg);
        }
    }

    public void solveHanoi(int numDisks) {

        for(int i = numDisks; i >= 1; i--)
        {
            this.pegA.push(i);
        }

        moveDisks(numDisks, this.pegA, this.pegB, this.pegC);

    }
}

