
package stackandqueuerunner;

/**
 *
 * @author IRENE
 */
public class Queue {
    int[] queue= new int[5];
    int size, front, rear;
    
    public void enQueue(int data){
    queue[rear]=data;
    rear++;
    size++;
    }
    public int deQueue(){
    int data=queue[front];
    front = front+1;
    size --;
    return data;
    }
    public void show(){
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[front+i]+ " ");
        }
        System.out.println("");
    }
}
