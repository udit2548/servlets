package demo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class Nurse implements Staff{
    public void assist(){
        System.out.println("Nurse is assisting");
    }
}
