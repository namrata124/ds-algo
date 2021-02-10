package java.com.ds.stack;

import com.ds.stack.IStack;
import com.ds.stack.StackImpl;
import org.junit.Assert;
import org.junit.Test;

public class TestStack {

    @Test
    public void testStack() {
        IStack stack = new StackImpl();
        // []
        stack.push(1);
        // [1]
        Assert.assertEquals(1, stack.pop());
        /*
         expected argument (1st) == actual argument (2nd)
         if yes -> continue execution
         if no -> throw exception : stop execution
        */
        // []
        stack.push(5);
        // [5]
        stack.push(4);
        // [5,4]
        Assert.assertEquals(4, stack.pop());
        // [5]
        Assert.assertEquals(1, stack.size());
        // [5]
        stack.push(6);
        // [5,6]
        stack.push(3);
        // [5,6,3]
        Assert.assertEquals(3, stack.peek());
        // [5,6,3]
        Assert.assertEquals(3, stack.pop());
        // [5,6]
        Assert.assertEquals(6, stack.pop());
        // [5]
        Assert.assertEquals(5, stack.pop());
        // []
    }


    @Test
    public void testPop() {
        IStack stack = new StackImpl();
        stack.push(1);
        Assert.assertEquals(1, stack.pop());
    }

}
