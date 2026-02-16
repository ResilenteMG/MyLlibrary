public class Main {
    public static void main(String[] args) {
        Book libro1 = new Book("Cien años de soledad", "Realismo mágico", "978-0307474728", "G. García Márquez", 25.50);
        Book libro2 = new Book("El señor de los anillos", "Fantasía", "978-8445000182", "J.R.R. Tolkien", 35.00);
        Book libro3 = new Book("Crepúsculo", "Romance vampírico", "978-0316160179", "Stephenie Meyer", 15.99);
        Book libro4 = new Book("El alquimista", "Aventura", "978-0062315007", "Paulo Coelho", 18.50);
        Book libro5 = new Book("It", "Terror", "978-1501142970", "Stephen King", 22.00);

        System.out.println(libro1.getTitle());
        System.out.println(libro2.getTitle());
    }
}