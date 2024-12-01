import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Bai 6
        System.out.println("Bai 6");
        System.out.println("Moi ban nhap so a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Moi ban nhap so b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap phep toan muon thuc hien (+/-/x/:): ");
        String math = scanner.nextLine();
        switch (math){
            case "+":
                double sum = a + b;
                System.out.println("Ket qua la :" + sum);
                break;
            case "-":
                double minus = a - b;
                System.out.println("Ket qua la :" + minus);
                break;
            case "x":
                double mul = a * b;
                System.out.println("Ket qua la :" + mul);
                break;
            case ":":
                double div = a / b;
                System.out.println("Ket qua la :" + div);
                break;
            default:
                System.out.println("Phep tinh khong hop le");
        }
//        Bai 9
        System.out.println("Bai 9");
        String name = ".";
        String address = ".";
        int age = 0;
        String condition = ".";
        do {
            System.out.println("Nhap ten hoc sinh: ");
            name = scanner.nextLine();
            System.out.println("Nhap dia chi: ");
            address = scanner.nextLine();
            System.out.println("Nhap tuoi: ");
            age = Integer.parseInt(scanner.nextLine());
            System.out.println("Ten hoc sinh: " + name);
            System.out.println("Dia chi: "+address);
            System.out.println("Tuoi: "+age);
            System.out.println("Ban co muon tiep tuc khong (y/n): ");
            condition = scanner.nextLine();
        } while (Objects.equals(condition, "y"));
        System.out.println("Da dung chuong trinh");
    }
}