import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Zookeeper {
    public static void main(String[] args) {
        String animalType = "Camel";
        Random temp = new Random();
        double min = 50.0;
        double max = 100.0;
        double randNum = temp.nextDouble();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalDateTime now = LocalDateTime.now();
        double showTemp = min + (max - min) * randNum;
        System.out.println("Animal type: " + animalType);
        System.out.println("Current time: " + dtf.format(now));
        System.out.printf("Habitat temperature: %.2fF" ,showTemp);
        System.out.println();

        Scanner habby = new Scanner(System.in);
        System.out.println("Please enter the number of the habitat you would like to view: \n1. Hippo\n2. Camel\n3. Elephant\n4. Monkey");
        int hab = habby.nextInt();

        String fileName = "";

        switch (hab) {
            case 1:
                fileName = "Zookeeper/animals/hippo.txt";
                break;
            case 2:
                fileName = "Zookeeper/animals/camel.txt";
                break;
            case 3:
                fileName = "Zookeeper/animals/elephant.txt";
                break;
            case 4:
                fileName = "Zookeeper/animals/monkey.txt";
                break;
            default:
                System.out.println("Invalid option. Please select a number between 1 and 4.");
                habby.close();
                return;
        }

        File file = new File(fileName);
        try (Scanner fr = new Scanner(file)) {
            while (fr.hasNextLine()) {
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("No file found: " + fileName);
        }

        habby.close();
    }
       /* String camel = """
            Look at our camel
            
             ___.-''''-.
            /___  @    |
            ',,,,.     |         _.'''''''._
                 '     |        /           \\
                 |     \\    _.-'             \\
                 |      '.-'                  '-.
                 |                               ',
                 |                                '',
                  ',,-,                           ':;
                       ',,| ;,,                 ,' ;;
                          ! ; !'',,,',',,,,'!  ;   ;:
                         : ;  ! !       ! ! ;  ;   :;
                         ; ;   ! !      ! !  ; ;   ;,
                        ; ;    ! !     ! !   ; ;     
                        ; ;    ! !    ! !     ; ;
                       ;,,      !,!   !,!     ;,;
                       /_I      L_I   L_I     /_I
        
                """;
        System.out.println(camel);

        File file = new File("Zookeeper/animals/hippo.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
*/

    }