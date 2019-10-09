package smallword.model;


 //STEP 2.1: Create basic class with constructors and getters and setters.
public class Client {
     private int id;

     private String title;
     private String lastName;
     private String nationality;


     //No args constuctor
     public Client() {
         super();
     }

     //All args contructor
     public Client(String title, String lastName, String nationality) {
         super();
         this.title = title;
         this.lastName = lastName;
         this.nationality = nationality;

     }

     //Getters and Setters

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public String getNationality() {
         return nationality;
     }

     public void setNationality(String nationality) {
         this.nationality = nationality;
     }
 }

