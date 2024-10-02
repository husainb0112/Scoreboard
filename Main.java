public class Main 
{
    public static void main(String[] args)
    {
        //Inititialization
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        
        //Test 1
        info = game.getScore();
        game.recordPlay(1);
        System.out.println(info);

        //Test 2
        info = game.getScore();
        game.recordPlay(0);
        System.out.println(info);

        //Test 3
        info = game.getScore();
        System.out.println(info);
        info = game.getScore(); 

        //Test 3
        game.recordPlay(3);
        System.out.println(info);
        info = game.getScore(); 
        System.out.println(info);
        game.recordPlay(1);
        game.recordPlay(0); 
        
        //Test 4
        info = game.getScore(); 
        System.out.println(info);
        game.recordPlay(0);

        //Test 5
        game.recordPlay(4);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        //Test 6
        Scoreboard match = new Scoreboard("Lions", "Tigers");
        info = match.getScore(); 
        System.out.println(info);
        info = game.getScore();
        System.out.println(info);


        

        

        
    }
}