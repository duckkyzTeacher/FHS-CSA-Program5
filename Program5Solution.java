//Program 5
/*
Program 5
Program Description:
Using the following data, calculate and print out the average miles per gallon for each vehicle.
Round the output to the nearest 10th gallon.
Be sure to use variables with easily recognizable names.
Program Data ##:
Vehicle	        Miles	Gallons
Royale	        286	9
Koopa King	412	40
Pipe Frame	361	18
Badwagon	161	11
Statements Required:
System.out
Variable Assignment
Math Operators
Sample Output:
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Badwagon averaged 14.6 m/g
 */

//Your code here:
public class Program5Solution{
    public static void main(String[] args){
        //Declare Variables
        String royalName = "Royale";
        int royalMiles = 286;
        int royalGal = 9;
        double royalAvg = 0.0;
        
        String koopaKingName = "Koopa King";
        int koopaKingMiles = 412;
        int koopaKingGal = 40;
        double koopaKingAvg = 0.0;
        
        String pipeFrameName = "Pipe Frame";
        int pipeFrameMiles = 361;
        int pipeFrameGal = 18;
        double pipeFrameAvg = 0.0;
        
        String bandwagonName = "Bandwagon";
        int bandwagonMiles = 161;
        int bandwagonGal = 11;
        double bandwagonAvg = 0.0;

        //Calc
        royalAvg = (double) royalMiles/royalGal;
        koopaKingAvg = (double) koopaKingMiles/koopaKingGal;
        pipeFrameAvg = (double) pipeFrameMiles/pipeFrameGal;
        bandwagonAvg = (double) bandwagonMiles/bandwagonGal;
        
        //Get rid of decimals
        royalAvg = ((int)((royalAvg*10)+0.5))/10.0;
        koopaKingAvg = ((int)((koopaKingAvg*10)+0.5))/10.0;
        pipeFrameAvg = ((int)((pipeFrameAvg*10)+0.5))/10.0;
        bandwagonAvg = ((int)((bandwagonAvg*10)+0.5))/10.0;
        
        //Print results
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println(royalName + " averaged " + royalAvg + " m/g");
        System.out.println(koopaKingName + " averaged " + koopaKingAvg + " m/g");
        System.out.println(pipeFrameName + " averaged " + pipeFrameAvg + " m/g");
        System.out.println(bandwagonName + " averaged " + bandwagonAvg + " m/g");
    }
}

//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1 m/g
Bandwagon averaged 14.6 m/g
 */
