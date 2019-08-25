public class HeyJude{
    static String HEY = "Hey Jude ";
static    String DON = "don't ";
static    String MAK = "make it bad.";
static    String BEA = "be afraid.";
static    String LET = "let me down.";
static    String TAK = "Take a sad song and make it better.";
static    String YOW = "You were made to go out and get her.";
static    String YOH = "You have found her, now go and get her.";
static    String REM = "Remember to ";
static    String LEH = "let her into you heart.";
static    String LES = "let her into your skin.";
static    String THE = "Then you ";
static    String CAN = "can start ";
static    String BEG = "begin ";
static    String TOM = "to make it better ";
static    String BET = "better ";
static    String NA  = "na ";

static	String MISS="The minute you let her under your skin";

static    String AND = "And anytime you feel the pain, hey Jude, refrain,\n"
	                            + "Don’t carry the world upon your shoulders.\n"
                                    + "For well you know that it’s a fool who plays it cool\n"
	                            + "By making his world a little colder.";

static    String SOL = "So let it out and let it in, hey Jude, begin,\n"
	                            + "You’re waiting for someone to perform with.\n"
	                            + "And don’t you know that it’s just you, hey jude, you’ll do,\n"
	                            + "The movement you need is on your shoulder.";

    public static void main (String[] args){
int h=1;
int dont=1;
	for(h=1; h<=5;h++){
	System.out.println("\n");
	System.out.print(HEY);
		System.out.print(DON);

		if(dont<=4){
		switch(dont){
		case 1:				
		System.out.print (MAK + TAK);
		dont=2;
		break;
		case 2:
		System.out.print(BEA + YOW + MISS);
		dont=3;
		break;
		case 3:
		System.out.print(LET + YOH);
		dont=4;
		break;
		case 4:
		System.out.print (MAK + TAK);
		dont =5;
		break;
		default:
		}
		}		
		
		if( dont==2 || dont==5){
		System.out.println(REM);
		if(dont==5){
		System.out.print(LES);
		}
		if(dont==4){
		System.out.println(LEH);
		}
		while (h==1){
		System.out.println(LEH);
		h=2;
		}


		
		}

		System.out.print(THE);		
				
		if(h==2 || h==4 ){
		System.out.print(CAN);
		}
		if(h==3 || h==5){
		System.out.print(BEG + TOM);
		if(h==3){
		System.out.println("\n" + "\n" + AND + "\n" + "\n" );	
		}
		if(h==5){
			
			for(int i=0; i<=3; i++){
			System.out.print(BET);
			}
			System.out.print("AHHHH!");
		}		
			
			for(int i=1; i<=9; i++){
			System.out.print(NA);
			}
		}
		if(h==2 || h==4){
		System.out.print(TOM);
		if(h==4){
		System.out.println("\n" + "\n" + SOL + "\n"  );
		for(int i=1; i<=9; i++){
			System.out.print(NA);
			}
		}
		}

        }
    }   
}

