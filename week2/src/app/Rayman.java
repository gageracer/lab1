package app;

public class Rayman{

    private float dickSize;
    private String suitColor;
    private int boyFriends;
    private boolean isOpen;
    private String name;

    public Rayman(String name) {
        this.name = name;
    }

    /**
     * @return the isOpen
     */
    public boolean isOpen() {
        return isOpen;
    }

    /**
     * @param isOpen the isOpen to set
     */
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    /**
     * @return the boyFriends
     */
    public int getBoyFriends() {
        return boyFriends;
    }

    /**
     * @param boyFriends the boyFriends to set
     */
    public void setBoyFriends(int boyFriends) {
        this.boyFriends = boyFriends;
    }

    /**
     * @return the suitColor
     */
    public String getSuitColor() {
        return suitColor;
    }

    /**
     * @param suitColor the suitColor to set
     */
    public void setSuitColor(String suitColor) {
        this.suitColor = suitColor;
    }

    /**
     * @return the dickSize
     */
    public float getDickSize() {
        return dickSize;
    }

    /**
     * @param dickSize the dickSize to set
     */
    public void setDickSize(float dickSize) {
        this.dickSize = dickSize;
    }

    public void dance(Rayman other) {
        isOpen = false;

    }

    public String amIGay (){
        if(this.isOpen){
            return "Yes you are!";
        }
        else{
            return "No...Not yet!";
        }
    }
    public void comeOut(){
        if(!this.isOpen){
            System.out.println("I am Gaay!");
        }

    }
    public void eat(String food){
        System.out.println("I am eating " + food);
    }

    public void sleep(Rayman other){
        if(other.isOpen()){
            System.out.println("You lucky!");
        }
        else{
            System.out.println("Bad lucks buddy.");
        }
    }

}