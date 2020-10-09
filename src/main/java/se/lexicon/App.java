package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.models.Student;
import se.lexicon.service.StudentManagement;

public class App {
    public static void main(String[] args) {

        // load the Spring configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        // retrieve bean from spring container
        StudentManagement studentManagement = context.getBean(StudentManagement.class);

        // call method on bean

//        System.out.println("Testing findAll:");
//        System.out.println(studentDao.findAll());
//
//        System.out.println("\nTesting getInt (enter integer): ");
//        System.out.println(userInputService.getInt());
//
//        System.out.println("\nTesting getString (enter string): ");
//        System.out.println(userInputService.getString());

//        System.out.println("Testing findAll:");
//        System.out.println(studentManagement.findAll());

        Student test = studentManagement.create();
        Student test2 = studentManagement.create();

        studentManagement.findAll().forEach(System.out::println);
        System.out.println();

        studentManagement.remove(1);
        studentManagement.remove(5000);

        System.out.println(studentManagement.find(1));
        System.out.println(studentManagement.find(2));
        System.out.println(studentManagement.find(5000));

    }
}