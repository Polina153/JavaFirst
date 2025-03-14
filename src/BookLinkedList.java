class BookLinkedList implements BookList {

    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public void add(Book book) {
        if (size == 0) {
            first = new Node(null, book, null);
            last = first;
        } else {
            Node secondLast = last;
            last = new Node(secondLast, book, null);
            secondLast.next = last;
        }
        size++;
    }

    @Override
    public void add(Book book, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(book);
            return;
        }
        Node nodeNext = getNode(index);
        Node nodePrevious = nodeNext.previous;
        Node newNode = new Node(nodePrevious, book, nodeNext);
        nodeNext.previous = newNode;
        if (nodePrevious != null) {
            nodePrevious.next = newNode;
        } else {
            first = newNode;
        }
        size++;
    }

    @Override
    public Node getNode(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public boolean remove(Book book) {
        Node node = first;
        for(int i = 0; i < size; i++){
            if(node.value.equals(book)){
                return removeAt(i);
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        Node node = getNode(index);
        Node nodeNext = node.next;
        Node nodePrevious = node.previous;
        if (nodeNext != null) {
            nodeNext.previous = nodePrevious;
        } else {
            last = nodePrevious;
        }
        if (nodePrevious != null) {
            nodePrevious.next = nodeNext;
        } else {
            first = nodeNext;
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    static class Node {
        private Node previous;
        private Book value;
        private Node next;

        public Node(Node previous, Book value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
}
