import java.util.Scanner;

public class Assignment3 {
    private static Scanner Scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String red = "\033[31m";
        String blue = "\033[34m";
        String green = "\033[32m";
        String invSub = "Invalid Subject";
        String invMark = "Invalid Mark";
        String bolt = "\033[1m";
        String reset = "\033[0m";


        // check name
        System.out.print("Enter your name: ");
        String name = Scanner.nextLine();
        if ((name.strip()).length() == 0) {
            System.out.printf("%s%s%s \n",red,"Invalid name",reset);

        }
        else {
            // Check age
            System.out.print("Enter your Age: ");
            int age = Scanner.nextInt();

            if (age<10 | age >18) System.out.printf("%s%s%s \n",red,"Invalid Age",reset);

            //Check subject marks
            else {
                System.out.print("Enter your subject 1: ");
                Scanner.nextLine();
                String subject1 = Scanner.nextLine();

                // check subject 1
                if (subject1.startsWith("SE-") == false) System.out.printf("%s%s%s \n",red,invSub,reset);
                else {
                    System.out.print("Enter your Mark 1: ");
                    float mark1 = Scanner.nextFloat();
                    
                    //check marks1
                    if (mark1 < 0 | mark1 > 100  ) System.out.printf("%s%s%s \n",red,invMark,reset);
                    else{
                        Scanner.nextLine();
                        System.out.print("Enter your subject 2: ");
                        
                        String subject2 = Scanner.nextLine();
                        
                        //check subject 2
                        if (subject2.equals(subject1) | subject2.startsWith("SE-") == false ) System.out.printf("%s%s%s \n",red,invSub,reset);
                        else{
                            System.out.print("Enter your Mark 2: ");
                            //Scanner.nextFloat();
                            float mark2 = Scanner.nextFloat();
                            
                            // check marks 2
                            if (mark2 < 0 | mark2 > 100) System.out.printf("%s%s%s \n",red,invMark,reset);
                            else{
                                Scanner.nextLine();
                                System.out.print("Enter your subject 3: ");
                                String subject3 = Scanner.nextLine();

                                //check sujbect 3
                                if (subject3.equals(subject1) | subject3.equals(subject2) | subject3.startsWith("SE-") == false ) System.out.printf("%s%s%s \n",red,invSub,reset);
                                else {
                                    System.out.print("Enter your Mark 3: ");
                                    float mark3 = Scanner.nextFloat();
                                    
                                    float total = mark1 + mark2 + mark3;
                                    float avg = (float)(total/3.0);
                                    // System.out.println(total);
                                    // System.out.println(avg);

                                    String crdP = "\033[32mCredit pass\033[0m";
                                    String pass = "\033[34mPass\033[0m";
                                    String fail = "\033[31mFail\033[0m";

                                    // Define Status
                                    String statS1;
                                    if (mark1 >= 75)statS1 = crdP;
                                    else if (mark1 >= 55 & mark1 <75) statS1 = pass;
                                    else statS1 = fail;

                                    // Check status of Subject 1
                                    String statS2;
                                    if (mark2 >= 75)statS2 = crdP;
                                    else if (mark2 >= 55 & mark2 <75) statS2 = pass;
                                    else statS2 = fail;
                                    
                                    // Check status of Subject 2
                                    String statS3;
                                    if (mark3 >= 75)statS3 = crdP;
                                    else if (mark3 >= 55 & mark3 <75) statS3 = pass;
                                    else statS3 = fail;

                                    // Check status of Subject 3
                                    String status;
                                    if (avg >= 75)status = crdP;
                                    else if (avg >= 55 & avg <75) status = pass;
                                    else status = fail;
                                    // Table
                                    System.out.printf("+----------------------------------+ \n");
                                    System.out.printf( "| Name: %s%s%-27s%s| \n",bolt,blue,name.toUpperCase(),reset);
                                    System.out.printf("| Age: %-2s %-25s| \n",age,"years old");
                                    System.out.printf("| Status: %s%s%-34s|\n",green,bolt,status);
                                    System.out.printf("| Total: %-8.2f      Avg: %-5.2f%s |\n",total,avg,"%");
                                    System.out.println("+----------+---------+-------------+");
                                    System.out.printf("| %-9s| %-8s| %-12s|\n","Subject","Marks","Status");
                                    System.out.println("+----------+---------+-------------+");
                                    System.out.printf("| SE-%03d%3s|%8.2f%s| %-21s| \n",Integer.valueOf(subject1.substring(3)),"",mark1,"%",statS1);
                                    System.out.println("+----------+---------+-------------+");
                                    System.out.printf("| SE-%03d%3s|%8.2f%s| %-21s| \n",Integer.valueOf(subject2.substring(3)),"",mark2,"%",statS2);
                                    System.out.println("+----------+---------+-------------+");
                                    System.out.printf("| SE-%03d%3s|%8.2f%s| %-21s| \n",Integer.valueOf(subject3.substring(3)),"",mark3,"%",statS3);
                                    System.out.println("+----------+---------+-------------+");


                                }


                            }

                        }

                    }
                    

                    


                }
            
            
            
            }




        }
        
    }
    
}
