import java.util.HashSet;

public class SetNoteBook {
        HashSet<NoteBook> NoteBookSet = new HashSet<NoteBook>();

        public SetNoteBook() {
                NoteBook note1 = new NoteBook(898989, "ASUS", "Vivobook Pro 16",
                                16, 512, "Windows", "black", 113200);
                NoteBook note2 = new NoteBook(717171, "Apple", "MacBook Air 13", 8,
                                256, "macOS", "gold", 79990);
                NoteBook note3 = new NoteBook(909090, "Xiaomi", "RedmiBook 14", 16,
                                512, "Windows", "silver", 59000);
                NoteBook note4 = new NoteBook(121212, "HP", "Spectre X360", 16,
                                512, "Windows", "black", 128843);
                NoteBook note5 = new NoteBook(343434, "Lenovo", "ThinkPad X1 Carbon Gen 9",
                                16, 512, "Windows", "black", 180990);
                NoteBookSet.add(note1);
                NoteBookSet.add(note2);
                NoteBookSet.add(note3);
                NoteBookSet.add(note4);
                NoteBookSet.add(note5);
        }

        public SetNoteBook(HashSet<NoteBook> tempSet) {
                NoteBookSet = tempSet;
        }

        public void printSet() {
                for (NoteBook noteBook : NoteBookSet) {
                        System.out.println(noteBook);
                        System.out.println("\n");
                }
        }

        public void searchOS(String os) {
                HashSet<NoteBook> answer = new HashSet<>();
                for (NoteBook noteBook : NoteBookSet) {
                        if (noteBook.OS.equals(os)) {
                                answer.add(noteBook);
                        }
                }
                SetNoteBook tempSet = new SetNoteBook(answer);
                tempSet.printSet();
        }

        public void searchRAM(int minRAM, int maxRAM) {
                HashSet<NoteBook> answer = new HashSet<>();
                for (NoteBook noteBook : NoteBookSet) {
                        if (noteBook.RAM >= minRAM && noteBook.RAM <= maxRAM) {
                                answer.add(noteBook);
                        }
                }
                SetNoteBook tempSet = new SetNoteBook(answer);
                if (tempSet.NoteBookSet.size() == 0)
                        System.out.println("По заданному вами вами диапазрну значений ничего не найдено.");
                else
                        tempSet.printSet();
        }

        public void searchHD(int minHD, int maxHD) {
                HashSet<NoteBook> answer = new HashSet<>();
                for (NoteBook noteBook : NoteBookSet) {
                        if (noteBook.HD >= minHD && noteBook.HD <= maxHD) {
                                answer.add(noteBook);
                        }
                }
                SetNoteBook tempSet = new SetNoteBook(answer);
                if (tempSet.NoteBookSet.size() == 0)
                        System.out.println("По заданному вами вами диапазрну значений ничего не найдено.");
                else
                        tempSet.printSet();
        }

        public void searchCost(int minCost, int maxCost) {
                HashSet<NoteBook> answer = new HashSet<>();
                for (NoteBook noteBook : NoteBookSet) {
                        if (noteBook.cost >= minCost && noteBook.cost <= maxCost) {
                                answer.add(noteBook);
                        }
                }
                SetNoteBook tempSet = new SetNoteBook(answer);
                if (tempSet.NoteBookSet.size() == 0)
                        System.out.println("По заданному вами вами диапазрну значений ничего не найдено.");
                else
                        tempSet.printSet();
        }
}
