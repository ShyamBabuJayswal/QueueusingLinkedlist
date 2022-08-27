//o(1) all operation
//1----->2--------3
//^               ^
//|               |
//Head            Tail
public class qusinglinkedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        static class Queue {
            static Node head = null;
            static Node tail = null;

            public static boolean isempty() {
                return head == null & tail == null;
            }

            //here we not create isfull beacause linked list is varible length
            //enqueue
            public static void add(int data) {
                Node newNode = new Node(data);//make new node and pass data
                if (tail == null) {
                    tail = head = null;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
            }

            //Dequeue
            public static int remove() {
                if (isempty()) {
                    return -1;
                }
                int front = head.data;
                if (head == tail) {
                    tail = null;
                }
                head = head.next;
                return front;
            }

            //peek
            public static int peek() {
                if (isempty()) {
                    return -1;
                }
                return head.data;
            }
        }
    }}
