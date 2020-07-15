package stackandqueuerunner;

/**
 *
 * @author IRENE
 */
public class StackAndQueueRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==============STACKs============");
        Stack nums = new Stack();
        //push to stack
        nums.push(15);
        nums.push(8);
        nums.push(5);
        nums.push(5);
        //pop the last element that was added
        System.out.println("Poped element: "+nums.pop());
        //traverse stack printing out the elements
        nums.show();

        System.out.println("==============QUEUEs============");
        Queue queue = new Queue();
        queue.enQueue(5);
         queue.enQueue(15);
         queue.enQueue(7);
         queue.enQueue(10);
         
        System.out.println("Dequeued Element: "+  queue.deQueue());
        queue.show();
    }

}
