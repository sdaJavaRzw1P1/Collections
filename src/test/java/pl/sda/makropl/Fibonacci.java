package pl.sda.makropl;

public class Fibonacci {

    public int calculate(int index){
        if (index==0){return 0;
        } else if(index==1){return 1;
        }

        return calculate(index-2)+calculate(index-1);
    }
}
