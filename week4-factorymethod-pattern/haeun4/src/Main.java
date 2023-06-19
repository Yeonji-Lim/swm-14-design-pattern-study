public class Main {
    public static void main(String[] args) {
        // case 1 - keyword ver
        configure("keyword");
        System.out.println();
        // case 2 - diary ver
        configure("diary");
    }

    public static void configure(String type) {
        Editor editor = null;
        if (type.equals("keyword")) {
            editor = new KeywordEditor();
        } else if (type.equals("diary")) {
            editor = new DiaryEditor();
        }
        editor.createReport();
    }
}