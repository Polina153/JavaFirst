public interface BookList {

    public void add(Book book);

    public void add(Book book, int index);

    public BookLinkedList.Node getNode(int index);

    public boolean remove(Book book);

    public boolean removeAt(int index);

    public int size();

    public void clear();
}