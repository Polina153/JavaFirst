class MyArrayList {

    private String[] array = new String[10];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public String[] getArray() {
        return array;
    }

    void add(String str) {
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = str;
        size++;
    }

    void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    void remove(String name) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (name.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "No element with this name";
        }
    }
}
