package dog;

public class Affenpinscher extends PetDogs {

    private String color = "black and brown";
    private String nickname;

    public Affenpinscher(){

    }
    public Affenpinscher(String color, String nickname){
        setColor(color);
        setNickname(nickname);
    }

    public static void dance(){
        System.out.println("Dance, doggie!  Dance!");
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
