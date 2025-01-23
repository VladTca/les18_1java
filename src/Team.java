import java.util.Arrays;

public class Team {
    private Person[] array;
    private int capacity;
    private int size;

    public Team(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        array = new Person[capacity];
    }

    public void add(Person person) {
        if (size < array.length) {
            array[size] = person;
            size++;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public int size() {
        return size;
    }

    public Person get(int index) {
        return array[index];
    }


    @Override

    public String toString() {
        String reusult = "Team:";
        for (int i = 0; i < size; i++) {
            reusult += array[i];
        }
        return reusult;
    }
}
