public class StrinFigures{
public static void main(String[]args){

System.out.print(getSecHour(30));
}
    public static int getSecHour(int minutes){
    int hours = minutes/60 ; 
    int seconds = 60 * minutes;
    return hours; 
    return seconds;
}
}

