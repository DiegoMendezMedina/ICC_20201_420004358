import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.LinkedList;

/**
 * Reader is a class wich we reads points in 2D from a file txt 
 */
public class Reader {

    /**
     * getCoords a list of coordinates
     * @param name name of the file that Reader reads
     * @return a list with the coordinates
     */
    public static LinkedList<Float[]> getCoords(String name) {

        LinkedList<Float[]> list = new LinkedList<>();
        Charset charset = Charset.forName("ISO-8859-1");
        Path path = null;


        // Gets the path of the file
        try {
            path = Paths.get(Reader.class.getClassLoader().getResource(name).toURI());
        } catch (URISyntaxException e) {
            System.err.println(e);
        }

        List<String> lines = null;
        try {
            lines = Files.readAllLines(path, charset);
        } catch(IOException e){
            System.err.println(e);
        }  catch(Exception e){
            System.err.println(e);
        }

        try {
            for (String line : lines) {
                String[] xy = line.split(",");
                Float x = Float.parseFloat(xy[0]);
                Float y = Float.parseFloat(xy[1]);
                Float[] point = {x,y};
                list.add(point);
            }
        } catch(NullPointerException e) {
            System.err.println(e);
        }
        catch(Exception e){
            System.err.println(e);
        } 

        return list;

    }

}
