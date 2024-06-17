package com.dev.record;

public record Range(int from, int to) {
    public Range {
        if(from > to) {
            int temp = from;
            from = to;
            to = temp;
        }
    }
}
