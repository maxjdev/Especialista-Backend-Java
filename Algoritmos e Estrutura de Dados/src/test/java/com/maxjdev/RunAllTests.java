package com.maxjdev;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        com.maxjdev.queue.QueueTest.class,
        com.maxjdev.stack.StackTest.class,
        com.maxjdev.linkedList.LinkedListTest.class,
        com.maxjdev.hashMap.HashMapTest.class
})
public class RunAllTests {
}
