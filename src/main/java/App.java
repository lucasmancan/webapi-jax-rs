import ws.TesteWebService;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class App extends Application {

    private Set<Class<?>> classes = new HashSet<Class<?>>();

    public App(){
        classes.add(TesteWebService.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}