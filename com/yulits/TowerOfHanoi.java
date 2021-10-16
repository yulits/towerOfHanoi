package com.yulits;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Stack;

public class TowerOfHanoi {

    Stack<Integer> pegA = new Stack<Integer>();
    Stack<Integer> pegB = new Stack<Integer>();
    Stack<Integer> pegC = new Stack<Integer>();
//    int disk;
//    Stack<Integer> sparePeg = new Stack<Integer>();

    private Stack<Integer> sparePeg(Stack<Integer> fromPeg, Stack<Integer> toPeg) {
        for (Stack peg : Arrays.asList(this.pegA, this.pegB, this.pegC)) {
            if ((peg != fromPeg) && (peg != toPeg)) {
                return peg;
            }
        }
        return new Stack();
    }

    public void printTowerOfHanoi() {

        System.out.println("");
        System.out.println("PegA: " + this.pegA);
        System.out.println("PegB: " + this.pegB);
        System.out.println("PegC: " + this.pegC);

    }

    private void moveDisks(int numDisks, Stack<Integer> fromPeg, Stack<Integer> toPeg) {

        if (numDisks == 1) {
            toPeg.push(fromPeg.pop());
        }
        else {
            Stack<Integer> sparePeg = new Stack<Integer>();
            moveDisks(numDisks-1, fromPeg, sparePeg);
            toPeg.push(fromPeg.pop());
            moveDisks(numDisks-1, sparePeg, toPeg);
        }
    }

    public void solveHanoi(int numDisks) {

        for(int i = numDisks; i >= 1; i--)
        {
            this.pegA.push(i);
        }
        moveDisks(numDisks, this.pegA, this.pegB);
    }
}

