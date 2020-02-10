package Homework8;

public class BuildPrinter {

    public static void main(String[] args) {

        //printer instance
        printer printerOne = new printer();
        printer printerTwo = new printer();

        //print double side
        printerTwo.setTonerLevel(10);
        System.out.println("Toner Level: " + printerTwo.getTonerLevel());

        printerTwo.printPage(100, 1, false);

        System.out.println("Number of Printed pages: " + printerTwo.getPrintedPages());
        System.out.println("Number of Printed sheets: " + printerTwo.getPrintedSheets());
        System.out.println("Toner Level: " + printerTwo.getTonerLevel());
    }
}
