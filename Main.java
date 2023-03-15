import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Podaj co chcesz zrobić:");
    System.out.println("1.Oblicz pole prostokąta:");
    System.out.println("2.Oblicz pole trójkąta prostokątnego:");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    switch (x){
      case 1:
        System.out.println("Podaj jeden bok:");
        double a1 = scanner.nextInt();
        System.out.println("Podaj drugi bok:");
        double b1 = scanner.nextInt();
        double mnozenie;
        mnozenie=a1*b1;
        System.out.println(mnozenie);
        break;
        case 2:
        System.out.println("Podaj bok:");
        double a2 = scanner.nextInt();
        System.out.println("Podaj wysokość:");
        double h = scanner.nextInt();
        double pole;
        pole=0.5*a2*h;
        System.out.println(pole);
        break;
    }
  }
}