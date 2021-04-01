package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class StoryBook implements Printable {

    private List<ColoredPage> pages = new ArrayList<>();

    @Override
    public int getLength() {
        return pages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return String.valueOf(pages.get(pageNumber));
    }

    @Override
    public String getColor(int pageNumber) {
        return pages.get(pageNumber).getColor();
    }

    public void addPage(String page, String color) {
        pages.add(new ColoredPage(page, color));
    }

    @Override
    public String toString() {
        return "StoryBook{" +
                "pages=" + pages +
                '}';
    }
}
