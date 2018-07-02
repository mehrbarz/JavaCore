import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class JAVAIO {

	public static void main(String[] args) {
		
		try (Stream<String> lines = Files.lines(Paths.get("/usr/share/dict/words"))){
			lines.filter(s -> s.length() > 20)
			.sorted(Comparator.comparingInt(String::length).reversed())
			.limit(10)
			.forEach(w -> System.out.printf("%s (%d) %n" , w, w.length()));
			
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
