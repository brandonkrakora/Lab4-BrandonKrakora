class Node<E> {
      public E data;
      public Node<E> next;
      public Node(final E data, final Node<E> next) {
        if (data == null) throw new IllegalArgumentException("data is null");
        this.data = data;
        this.next = next;
      }
      public Node(final E data) { this(data, null); }
      public String toString() {
        return "Node@" + hashCode() + "(" + data +
          (next != null ? ", Node@" + next.hashCode() + ")" : ")");
      }
   }
Node<String> greetingNode = new Node<>("hello");
Node<String> nameNode = new Node<>("Brandon");
Node<String> whatNode = new Node<>("what");
Node<String> upNode = new Node<>("up");
greetingNode.next = nameNode
greetingNode.next = nameNode
nameNode.next = whatNode
nameNode.next = whatNode
nameNode.next = whatNode
greetingNode.next = nameNode
nameNode.next = whatNode
whatNode.next = upNode
greetingNode.toString();
greetingNode.next.toString();
greetingNode.next.next.toString();
greetingNode.next.next.next.toString();
Node<String> singleStatementLinkedList = new Node<>("hello", new Node<>("Brandon", new Node<>("what", new No de<>("up"))));
Node<String> singleStatementLinkedList = new Node<>("hello", new Node<>("Brandon", new Node<>("what", new Node<>("up"))));
public void printNode(Node<E> linkedList) {
        Node curr = linkedList;
        while (curr != null) {
   	      System.out.println(curr.data);
          curr = curr.next;
       }
     }
public <E> void printNode(Node<E> linkedList) {
        Node curr = linkedList;
        while (curr != null) {
          System.out.println(curr.data);
          curr = curr.next;
        }
      }
greetingNode.printNode(greetingNode);
greetingNode.toString()
printNode(greetingNode);
nameNode.next = upNode;
printNode(greetingNode);
upNode.next = whatNode;
whatNode.next = null;
printNode(greetingNode);
public <E> void printCycleNode(Node<E> linkedList) {
            Node curr = linkedList;
            while (curr != null) {
                System.out.println(curr.data);
                curr = curr.next;
                if(curr == linkedList)
                    break;
            }
        }
whatNode.next = greetingNode;
printCycleNode(greetingNode);
final List<String> myList = new LinkedList<>(Arrays.asList("hello", "Brandon", "what", "up"));
final Iterator i = myList.iterator();
while (i.hasNext()) {
                      System.out.println(i.next());
                 }
/save -history myhistory.jsh
