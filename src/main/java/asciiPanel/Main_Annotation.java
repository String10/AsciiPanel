package asciiPanel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Annotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config-annotation.xml");
        
        AsciiPanel panel = context.getBean("AsciiPanel", AsciiPanel.class);

        System.out.println(panel.getAsciiFont().getFontFilename());

        context.close();
    }
}
