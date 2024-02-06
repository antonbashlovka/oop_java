package Interface;

public interface iCalculable {

    iCalculable save (int... args);
    iCalculable sum (int... args);
    iCalculable multi (int... args);
    iCalculable divide (int... args);

    void printResult();

    
} 