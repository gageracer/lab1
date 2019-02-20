package app;


public class Model {
    
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;
    private static String occupation = "modeling";

    public Model() {
        setFirstName("firstName");
        setLastName("lastName");
    }

    /**
     * @return the smokes
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * @param smokes the smokes to set
     */
    public void setSmokes() {
        this.smokes = !this.smokes;
    }

    /**
     * @return the canTravel
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * @param canTravel the canTravel to set
     */
    public void setCanTravel() {
        this.canTravel = !this.canTravel;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        if((weight >=80)
        &&(weight <= 280)){
            this.weight = weight;
        }
        
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        if((height >=24)
        &&(height <= 84)){
                this.height = height;
            }
        
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        if((lastName != null) 
        && (lastName.length()>=3) 
        && (lastName.length()<=20)){
            this.lastName = lastName;
        }
        
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        if((firstName != null) 
            && (firstName.length()>=3) 
            && (firstName.length()<=20)){
                this.firstName = firstName;
            } 
        
    }

    public Model(String firstName, String lastName, 
    int height, double weight, boolean canTravel, 
    boolean smokes) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.canTravel = canTravel;
        this.smokes = smokes;

    }

    public Model(String firstName, String lastName, 
    int height, double weight) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.canTravel = true;
        this.smokes = false;

    }

    public void printDetails(){
        System.out.println("Name: "+getFirstName()+" "+getLastName());
        System.out.println("Height: "+getHeight()+" inches");
        System.out.println("Weight: "+ Math.round(getWeight())+ "pounds");
        if(isCanTravel()){
            System.out.println("Does travel");
        }
        else{
            System.out.println("Does not travel");
        }
        if(isSmokes()){
            System.out.println("Does smokes");
        }
        else{
            System.out.println("Does not smoke");
        }
        System.out.println();
    }
    
}