import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {

    private String filePath = "src/main/resources/a000040.txt"; //взято по адресу https://oeis.org/A000040/a000040.txt

    @Test
    void testFirst100() throws IOException {
        int num = 100;
        List<Integer> list = SimpleNum.getSimple(num);
        assertEquals(getSimpleNumToFile(num), list.get(list.size() - 1));
        assertEquals(num, list.size());
    }

    @Test
    void testFirst500() throws IOException {
        int num = 500;
        List<Integer> list = SimpleNum.getSimple(num);
        assertEquals(getSimpleNumToFile(num), list.get(list.size() - 1));
        assertEquals(num, list.size());
    }

    @Test
    void testFirst1000() throws IOException {
        int num = 1000;
        List<Integer> list = SimpleNum.getSimple(num);
        assertEquals(getSimpleNumToFile(num), list.get(list.size() - 1));
        assertEquals(num, list.size());
    }

    @Test
    void testFirst10000() throws IOException {
        int num = 10000;
        List<Integer> list = SimpleNum.getSimple(num);
        assertEquals(getSimpleNumToFile(num), list.get(list.size() - 1));
        assertEquals(num, list.size());
    }


    private int getSimpleNumToFile(int num) throws IOException {
        Path path = FileSystems.getDefault().getPath(filePath);
        Map<Integer, Integer> mapFromFile = Files.lines(path)
                .collect(Collectors.toMap(k -> Integer.parseInt(k.split(" ")[0]), v -> Integer.parseInt(v.split(" ")[1])));
        return mapFromFile.get(num);
    }

}
