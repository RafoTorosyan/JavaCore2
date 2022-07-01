package homework.books;

import homework.students.Student;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = book;

    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; 1 < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");

        }

    }

    public int getSize() {
        return size;
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[index] = array[index + 1];

            }
            size--;
            System.out.println("Book deleted");
        } else {
            System.out.println("Index out of Bounds");
        }
    }

    public void printBooksByAuthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                System.out.println(array[i]);
            }

        }
    }

    public void printBooksByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
            }

        }
    }


    public void printBooksByPrice(double price) {
        for (int i = 0; i <size ; i++) {
            if (array[i].equals(price));

        }
    }
}




