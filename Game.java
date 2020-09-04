import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of people");
        int numberOfStudent=scanner.nextInt();
        System.out.println("Enter duration of song");
        int musicDuration=scanner.nextInt();
        int winnerTag=findWinner(numberOfStudent,musicDuration);
        System.out.println("Winner is "+winnerTag);
        return;
    }

    public static int findWinner(int n,int d){
        //case where there no song played
        if(d==0){
            return -1;
        }
        ArrayList<Integer> people=new ArrayList<Integer>();
        //place people in initial order
        for(int i=1;i<=n;i++){
            people.add(i);
        }
        printPositions(people);
        return findNextPersonAfterElimination(people,-1,d);
    }

    public static int findNextPersonAfterElimination(List<Integer> people, int currIndex, int stepsAway){
        if(people.size()==1){
            return people.get(0);
        }
        currIndex=findNextPerson(people,currIndex,stepsAway);
        //Eliminate member from the position
        int removedNumber=people.remove(currIndex);
        System.out.println(removedNumber +"th person lost the game");
        printPositions(people);
        //return pillow to previous person
        currIndex--;
        //Note: Can cause stackoverflow for large number with this recursive approach.
        return findNextPersonAfterElimination(people,currIndex,stepsAway);
    }

    //returns position in the game whom to be eliminated
    public static int findNextPerson(List<Integer> people, int currIndex, int stepsAway){
        int nextIndex;
        nextIndex=((currIndex+stepsAway)%people.size());
        return nextIndex;
    }

    //To print postions of the people inbetween the game
    public static String getPositions(List<Integer> people){
        String positions = people.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
        return  positions;
    }

    public static void printPositions(List<Integer> people){
        System.out.println("Positions "+getPositions(people));
    }

}
