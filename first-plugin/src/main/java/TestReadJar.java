import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class TestReadJar {


    public static void main(String[] args) throws IOException {
        String resource = "12.json";

        // this is the path within the jar file
        InputStream input = TestReadJar.class.getResourceAsStream("/schema/" + resource);
        if (input == null) {
            // this is how we load file within editor (eg eclipse)
            input = TestReadJar.class.getClassLoader().getResourceAsStream(resource);
        }
        System.out.println(IOUtils.toString(input, "UTF-8"));
        List<InputStream> inputStreams = loadResources(resource, TestReadJar.class.getClassLoader());
        System.out.println(inputStreams.size());
    }

    public static List<InputStream> loadResources(
            final String name, final ClassLoader classLoader) throws IOException {
        final List<InputStream> list = new ArrayList<InputStream>();
        final Enumeration<URL> systemResources =
                (classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader)
                        .getResources(name);
        while (systemResources.hasMoreElements()) {
            list.add(systemResources.nextElement().openStream());
        }
        return list;
    }
}
