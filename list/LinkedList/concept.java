public class concept {
    
    private Node head;
    private Node tail;
    private int size;
    public concept(){
        this.size=10;
    } 
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
