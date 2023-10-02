package notebook;

public class NoteBookRunner {
    public static void main(String[] args){
        NoteBook note1 = new NoteBook();
        System.out.println(note1);
        note1.setNumPages(75);
        System.out.println(note1);
        NoteBook note2 = new NoteBook(45, "CollegeNote");
        System.out.println(note2);
    }
}
