package io.github.vbochenin;

import org.junit.runner.RunWith;
import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RunWith(BenchmarkRunner.class)
public class CollectionsBenchmark {

    @Benchmark
    public void addAndRemoveToArrayList(Data data) {
        data.arrayList.add(data.element);
        data.arrayList.remove(data.element);
    }

    @Benchmark
    public void addAndRemoveToLinkedList(Data data) {
        data.linkedList.add(data.element);
        data.linkedList.remove(data.element);
    }

    @State(Scope.Benchmark)
    public static class Data {
        private final List<Object> arrayList = new ArrayList<>();
        private final List<Object> linkedList = new LinkedList<>();

        private Object element;
        @Setup(Level.Iteration)
        public void setUp() {
            this.element = new Object();
        }


    }
}
