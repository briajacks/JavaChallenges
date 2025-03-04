package basics;

public class Strings {
    public static void main(String[] args) {
        String bookTitle;
        String wordChoice = "Ring";
        bookTitle = "The Lord of the Rings";

        if (bookTitle.contains(wordChoice)) {
            System.out.println("The book contains the word " + wordChoice);
        }

        String browser = "Chrome";
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("The browser is Chrome");
        }

        String firstName = "Bria";
        String lastName = "Jackson";
        String SSN = "123456789";

        System.out.println("There are " + SSN.length() + " digits in your SSN.");

        // Print the initials plus the last 4 digits of the SSN
        System.out.print(firstName.substring(0, 1));
        System.out.print(lastName.substring(0, 1));
        System.out.println(SSN.substring(5));

    }
}
