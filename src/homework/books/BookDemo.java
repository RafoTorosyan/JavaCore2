package homework.books;

import java.util.Scanner;

public class BookDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add book");
            System.out.println("Please input 2 for print all books");
            System.out.println("Please input 3 for print books count");
            System.out.println("Please input 4 for print books by AuthorName");
            System.out.println("Please input 5 for print books by genre");
            System.out.println("Please input 6 for print books by price range");
            System.out.println("Please input 7 for delete books by index");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    bookStorage.print();
                    break;
                case 3:
                    System.out.println(bookStorage.getSize());
                    break;
                case 4:
                    System.out.println("Please input AuthorName");
                    String authorName = scanner.nextLine();
                    bookStorage.printBooksByAuthorName(authorName);
                    break;
                case 5:
                    System.out.println("Please input genre");
                    String genre = scanner.nextLine();
                    bookStorage.printBooksByGenre(genre);
                    break;
                case 6:
                    System.out.println("Please input price");
                    double price = Double.parseDouble(scanner.nextLine());
                    bookStorage.printBooksByPrice(price);
                    break;
                case 7:
                    bookStorage.print();
                    System.out.println("Please input book index");
                    int index = Integer.parseInt(scanner.nextLine());
                    bookStorage.delete(index);

                    break;
                default:
                    System.out.println("Invalid Command, please try again");

            }


        }


    }

    private static void addBook() {
        System.out.println("Please input title");
        String title = scanner.nextLine();
        System.out.println("Please input AuthorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input count");
        String countStr = scanner.nextLine();
        System.out.println("Please input genre");
        String genre = scanner.nextLine();


        double price = Integer.parseInt(priceStr);
        int count = Integer.parseInt(countStr);
        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("Thank You, Book Added");

    }
}
