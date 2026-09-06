import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

               public class nibber{
	public static void main(String[] args)throws IOException, InterruptedException {

        String nword = "nigger";

	Files.lines(Paths.get("consonants.txt")).forEach(consonants -> { char query = consonants.charAt(0);  System.out.println(nword.replace('g', query)); try	{Thread.sleep(333);} catch(InterruptedException e){Thread.currentThread().interrupt();}});
	}
}
