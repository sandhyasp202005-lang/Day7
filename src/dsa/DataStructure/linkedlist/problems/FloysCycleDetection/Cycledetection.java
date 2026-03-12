package dsa.DataStructure.linkedlist.problems.FloysCycleDetection;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
    public class Cycledetection {
        static Node head = null;

        static void createList() {
            head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            head.next.next.next.next = new Node(50);
        }

        static boolean hasCycle() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;         //move 1 step
                fast = fast.next.next;        //move 2 steps
                if (slow == fast) {
                    return true;        //detected a cycle
                }
            }
            return false;
        }

  public static void main(String[] args) {
            createList();
            if (hasCycle()) {
                System.out.println("Cycle detected");
            } else {
                System.out.println("No cycle");

            }
        }
    }
