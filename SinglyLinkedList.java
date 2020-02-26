public class SinglyLinkedList {
  public Node head;
  public SinglyLinkedList() {
    this.head = null;
  };
  // SLL methods go here. As a starter, we will show you how to add a node to the list.
  public void add(int value) {
      Node newNode = new Node(value);
      if(head == null) {
          head = newNode;
      } else {
          Node runner = head;
          while(runner.next != null) {
              runner = runner.next;
          }
          runner.next = newNode;
      }
  };

  public void remove(){
    Node runner = this.head;
    if (runner.next == null) {
      this.head = null;
    } else {
      while(runner.next.next != null){
        runner = runner.next;
      }
      runner.next = null;
    }
  };

  public void printValues(){
    Node runner = this.head;
    while (runner != null){
      System.out.println(runner.value);
      runner = runner.next;
    }
  };

  public Node find(int val){
    Node runner = this.head;
    while (runner != null){
      if (runner.value == val){
        return runner;
      }
    }
    return null;
  };

  public void removeAt(int n){
    Node runner = this.head;
    int time = 0; 
    while (time < n-1){
      runner = runner.next;
      time ++;
    }
    runner.next = runner.next.next;
  };
}