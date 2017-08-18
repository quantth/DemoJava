/**
 * Created by NguyenVanQuan on 8/8/2017.
 */

public class QueueDemo {
  static class Queue {
      int front, rear; // đầu và cuối hàng đợi
      int data[]=new int[5];
      int count;

      void init(Queue que) { //khởi tạo hàng đợi rỗng
          que.front = 0;
          que.rear = -1;
          que.count = 0;
      }
  }
  private boolean isEmpty(Queue que){ //kiểm tra rỗng
     boolean check = que.count == 0;
      return check;
  }
  private boolean isFull(Queue que){  //kiểm tra đầy
     boolean check = que.count == 5;
      return check;
  }
  public void push(Queue que, int x){
      if (isFull(que)==true){
          System.out.println("Queue is full!");
      }
      else {
          que.data[++que.rear] = x;
          que.count++;
      }
      System.out.println("push("+x+")");
      System.out.println("Queue:"+ que.data[que.rear]);
  }
  public int pop(Queue que){
      if (isEmpty(que)== true){
          System.out.println("Queue is empty!");
          return que.data[que.front];
      }
      else{
          for (int i = que.front ; i < que.rear; i++){
              que.data[i]=que.data[i+1];
              que.rear--;
              que.count--;
            break;
          }
          return  que.data[que.front];
      }

  }
  int queFront(Queue que){
      if (isEmpty(que)== true){
          System.out.println("hàng đợi rỗng!");
          return que.data[que.front];
      }
      else
          return que.data[que.front];
  }
  public static void main(String[] args) {
      QueueDemo que = new QueueDemo();
      Queue q = new Queue();
      que.push(q, 3);
      que.push(q, 4);
      try{
          que.pop(q);
      }
      catch (Exception ex){
          System.out.println("Queue is empty!");
      }
  }
}