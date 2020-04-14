package ru.job4j.inheritence;

/**
 * 4. Переопределение[#257584]
 */
public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
