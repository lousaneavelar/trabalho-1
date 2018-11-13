package trabalho_1.trabalho_1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

import entidades.Menu;

public class App 
{
    public static void main( String[] args )
    {
    	Menu menu = new Menu();
        menu.menu();
    }
    
    public static Date randonDate() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2018, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        return java.sql.Date.valueOf(randomBirthDate);
    }
}
