import java.util.Scanner;

public class menu {

    static void filterNoteBook(SetNoteBook enterSet) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите цифру, соответствующую критерию поиска:\n" +
                "1 - RAM\n2 - Объем HD\n3 - Операционная система\n4 - Цена\n");
        String answer = iScanner.nextLine();
        switch (answer) {
            case "1":
                System.out.println("Введите минимальное значение RAM: ");
                int minRAM = Integer.parseInt(iScanner.nextLine());
                System.out.println("Введите максимальное значение RAM: ");
                int maxRAM = Integer.parseInt(iScanner.nextLine());
                enterSet.searchRAM(minRAM, maxRAM);
                break;
            case "2":
                System.out.println("Введите минимальное значение HD: ");
                int minHD = Integer.parseInt(iScanner.nextLine());
                System.out.println("Введите максимальное значение HD: ");
                int maxHD = Integer.parseInt(iScanner.nextLine());
                enterSet.searchHD(minHD, maxHD);
                break;
            case "3":
                System.out.println("Введите цифру, соответствующую OS для поиска:\n 1 - Windows\n 2 - macOS");
                String answer3 = iScanner.nextLine();
                if (answer3.equals("1"))
                    enterSet.searchOS("Windows");
                else if (answer3.equals("2"))
                    enterSet.searchOS("macOS");
                else
                    System.out.println("Вы ввели неверную цифру.");
                break;
            case "4":
                System.out.println("Введите минимальную цену: ");
                int minCost = Integer.parseInt(iScanner.nextLine());
                System.out.println("Введите максимальную цену: ");
                int maxCost = Integer.parseInt(iScanner.nextLine());
                enterSet.searchCost(minCost, maxCost);
                break;
            default:
                System.out.println("Вы ввели неверную цифру!");
        }
        iScanner.close();
    }

    public static void main(String[] args) {
        System.out.print("Добро пожаловать в каталог ноутбуков!\n");
        Scanner iScanner = new Scanner(System.in);
        SetNoteBook setNoteBook = new SetNoteBook();
        System.out.print("Выберите действие:\n 1 - Печать всех товаров\n 2 - Поиск по каталогу\n 0 - Выход\n");
        String answer1 = iScanner.nextLine();
        switch (answer1) {
            case "1":
                setNoteBook.printSet();
                break;
            case "2":
                filterNoteBook(setNoteBook);
                break;
            case "0":
                System.out.println("Пока-пока!");
                break;
            default:
                System.out.println("Вы ввели неверную цифру!");
        }
        iScanner.close();
    }

}
