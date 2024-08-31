package lk.ijse.gdse67;

import lk.ijse.gdse67.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();

        ctx.registerShutdownHook();
    }
}
