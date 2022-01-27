import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMyFile1() throws IOException {
        Path fileName = Path.of("C:/Users/Kyle/Documents/GitHub/markdown-parse/test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }

    @Test
    public void testMyFile2() throws IOException {
	String contents = Files.readString(Path.of("C:/Users/Kyle/Documents/GitHub/markdown-parse/test2.md"));
	List<String> expect = List.of("https://duckduckgo.com", "https://kde.org");
	assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testMyFile3() throws IOException {
	String contents = Files.readString(Path.of("C:/Users/Kyle/Documents/GitHub/markdown-parse/test3.md"));
	List<String> expect = List.of();
	assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testMyFile4() throws IOException {
	String contents = Files.readString(Path.of("C:/Users/Kyle/Documents/GitHub/markdown-parse/test4.md"));
	List<String> expect = List.of();
	assertEquals(MarkdownParse.getLinks(contents), expect);
    }

}