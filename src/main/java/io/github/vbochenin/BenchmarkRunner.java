package io.github.vbochenin;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

public class BenchmarkRunner extends Runner {

    @Override
    public Description getDescription() {
        //...
        return null;
    }

    @Override
    public void run(RunNotifier notifier) {
        //...
    }
}
