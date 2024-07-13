import java.util.*;
public class Rock_paper_scissor{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("************Rock-Paper-Scissor GAME******************");
        System.out.println("0-->Rock");
        System.out.println("1-->Paper");
        System.out.println("2-->Scissor");
        String play="yes";
        while(play.equals("yes"))
        {
            int comp_choice;
            int comp_score=0;
            int user_choice;
            int user_score=0;
            int round=1;
            while(round<=5)
            {
                Random rand=new Random();
                comp_choice=rand.nextInt(3);
                user_choice=sc.nextInt();
                switch(user_choice)
                {
                    case 0:
                        System.out.println("you choose rock");
                        break;
                    case 1:
                        System.out.println("you choose paper");
                        break;
                    case 2:
                        System.out.println("you choose scissor");
                        break;
                }
                switch(comp_choice)
                {
                    case 0:
                        System.out.println("computer choose rock");
                        break;
                    case 1:
                        System.out.println("computer choose paper");
                        break;
                    case 2:
                        System.out.println("computer choose scissor");
                        break;
                }
                if(comp_choice==user_choice)
                {
                    System.out.println("**match Tie**");
                }
                else if(comp_choice==0 && user_choice==1)
                {
                    System.out.println("you won!!");
                    user_score++;
                }
                if(comp_choice==0 && user_choice==2)
                {
                    System.out.println("computer won!!");
                    comp_score++;
                }
                else if(comp_choice==1 && user_choice==0)
                {
                    System.out.println("computer won!!");
                    comp_score++;
                }
                else if(comp_choice==1 && user_choice==2)
                {
                    System.out.println("you won!!");
                    user_score++;
                }
                else if(comp_choice==2 && user_choice==0)
                {
                    System.out.println("user won!!");
                    user_score++;
                }
                else if(comp_choice==2 && user_choice==1)
                {
                    System.out.println("computer won!!");
                    comp_score++;
                }
                round++;
                
            }
            System.out.println("**GAME OVER**");
            System.out.println("Computer score="+comp_score+"    "+"your score="+user_score);
            if(comp_score>user_score)
            {
                System.out.println("########## COMPUTER🖥️  WINS ##########");
            }
            else if(comp_score<user_score)
            {
                System.out.println("########## USER😎️ WINS ##########");
            }
            else{
                System.out.println("######### Tie😳️  ##########");
            }
            System.out.println("Want to play again..(yes/no):");
            play=sc.next().toLowerCase();
        }
        System.out.println("Thank's for participating🤩️");
        sc.close();
    }
}