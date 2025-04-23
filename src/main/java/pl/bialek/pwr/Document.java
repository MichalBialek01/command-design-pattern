package pl.bialek.pwr;

public class Document {
    private String clipboard = "";
    private String content = "";

    public void write(String text) {
        content += text;
        System.out.println("Zawartość dokumentu: " + content);
    }

    public void copy(String text) {
        clipboard = text;
        System.out.println("Skopiowano do schowka: " + clipboard);
    }

    public void paste() {
        content += clipboard;
        System.out.println("Wklejono ze schowka: " + clipboard);
    }

    public void undoPaste(int length) {
        if (content.length() >= length) {
            content = content.substring(0, content.length() - length);
        }
        System.out.println("Cofnięto wklejenie. Aktualna zawartość: " + content);
    }

    public String getClipboard() {
        return clipboard;
    }

    public int getClipboardLength() {
        return clipboard.length();
    }
}
