package book;

import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBooks = 10; 
        String[] titles = new String[numBooks];
        String[] authors = new String[numBooks];
        double[] prices = new double[numBooks];
        String[] publishers = new String[numBooks];
        String[] isbns = new String[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");

            System.out.print("Title: ");
            titles[i] = scanner.nextLine();

            System.out.print("Author: ");
            authors[i] = scanner.nextLine();

            System.out.print("Price: rs ");
            prices[i] = Double.parseDouble(scanner.nextLine());

            System.out.print("Publisher: ");
            publishers[i] = scanner.nextLine();

            System.out.print("ISBN: ");
            isbns[i] = scanner.nextLine();
        }

        displayBooks(titles, authors, prices, publishers, isbns, numBooks);
        Report(prices, numBooks);
    }

    public static void displayBooks(String[] titles, String[] authors, double[] prices, String[] publishers, String[] isbns, int numBooks) {
        System.out.printf("%-10s %-15s %-10s %-15s %-13s%n", "Title", "Author", "Price", "Publisher", "ISBN");
        System.out.printf("%-10s %-15s %-10s %-15s %-13s%n", "=====", "========", "======", "=========", "====");

        for (int i = 0; i < numBooks; i++) {
            System.out.printf("%-10s %-15s rs%-9.2f %-15s %-13s%n", titles[i], authors[i], prices[i], publishers[i], isbns[i]);
        }
    }

    public static void Report(double[] prices, int numBooks) {
        double totalCost = 0;
        double maxCost = prices[0];
        double minCost = prices[0];

        for (int i = 0; i < numBooks; i++) {
            totalCost += prices[i];
            if (prices[i] > maxCost) maxCost = prices[i];
            if (prices[i] < minCost) minCost = prices[i];
        }

        double avgCost = totalCost / numBooks;

        
        System.out.println("Total number of books: " + numBooks);
        System.out.println("Total cost of books: rs" + String.format("%.2f", totalCost));
        System.out.println("Maximum cost of a book: rs" + String.format("%.2f", maxCost));
        System.out.println("Minimum cost of a book: rs" + String.format("%.2f", minCost));
        System.out.println("Average cost of a book: rs" + String.format("%.2f", avgCost));
    }
}
