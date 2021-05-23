package ch11_encapsulation;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "======================================\n";
    private String title = "  name\t address \tphone   \n";

    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append("KimJJ \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("KimSY \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter() {
        buffer.append(line);
    }

    // Client only use this method
    public String getReport() {
        makeHeader();;
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}