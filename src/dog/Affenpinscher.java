package dog;

public class Affenpinscher extends PetDogs {

    private String color = "black and brown";
    private String nickname = "Gunther";

    public void dance(){
        System.out.println("Dance, Gunther, Dance!");
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getNickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
}
