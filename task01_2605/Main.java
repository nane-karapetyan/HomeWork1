package task01_2605;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);

        List<Double> doubleLinkedList = new LinkedList<>();
        doubleLinkedList.add(5.5);
        doubleLinkedList.add(10.2);
        doubleLinkedList.add(4.3);

        double arrayListSum = NumberSummation.sumOfList(integerArrayList);
        double linkedListSum = NumberSummation.sumOfList(doubleLinkedList);

        System.out.println("ArrayList (Integer) sum " + arrayListSum);
        System.out.println("LinkedList (Double) sum = " + linkedListSum);
    }
}
