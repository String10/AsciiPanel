package asciiPanel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main_Java {

    @Bean
    public AsciiPanel asciiPanel() {
        return new AsciiPanel();
    }

    @Bean
    public AsciiFont asciiFont() {
        return new AsciiFont("cp437_8x8.png", 8, 8);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main_Java.class);
        
        AsciiPanel panel = applicationContext.getBean(AsciiPanel.class);

        System.out.println(panel.getAsciiFont().getFontFilename());

        applicationContext.close();
    }
}