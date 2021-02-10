package com.ds.stack;

import java.util.LinkedList;
import java.util.List;

public class StackImpl implements IStack {

    private final List<Integer> list;

    public StackImpl() {
        this.list = new LinkedList<>();
        // this.list = new ArrayList<>();
    }

    @Override
    public void push(int a) {
        list.add(a);
    }

    @Override
    public int pop() {
        if (list.size() <= 0) {
            throw new IllegalArgumentException("invalid operation..!!");
        }
        return list.remove(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public int peek() {
        if (list.size() <= 0) {
            throw new IllegalArgumentException("invalid operation..!!");
        }
        return list.get(list.size() - 1);
    }

}
