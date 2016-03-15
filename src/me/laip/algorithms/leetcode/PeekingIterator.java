package me.laip.algorithms.leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Arthur on 2016/3/15.
 * leetcode 284
 */
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer nextInteger;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        if (iterator.hasNext()) {
            nextInteger = iterator.next();
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextInteger;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer result = nextInteger;
        if (iterator.hasNext()) {
            nextInteger = iterator.next();
        } else {
            nextInteger = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return nextInteger != null;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        List<Integer> integers = Arrays.asList(array);
        Iterator<Integer> integerIterator = integers.iterator();
        PeekingIterator peekingIterator = new PeekingIterator(integerIterator);

        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());

    }

}