package pl.sda.sdatryRP;

public class Rice {

    private int m; //5kg
    private int n; //kg


    public boolean buy(int ileKilo){

       int ileMpaczek=0;
       int ileNpaczek=0;

        if(ileKilo>=5){
            if(ileKilo%5==0){
                ileMpaczek=ileKilo/5;

            }else {
                ileMpaczek=ileKilo/5;
                ileNpaczek=ileKilo-ileMpaczek*5;
            }
        } else {
            //ileMpaczek=0;
            ileNpaczek=ileKilo;
        }


         int x = Math.min(ileMpaczek,this.m);
        int y = Math.min(ileKilo-x*5,this.n);


        System.out.println(" w zamowieniu poszło: "+x+" paczek 5kg i " + y+ " paczek 1kg");
        this.m=this.m-x;
        this.n= this.n-y;
       if( this.m-x >=0 && this.n-y>=0){return true;}







       System.out.println(" w zamowieniu poszło: "+x+" paczek 5kg i " + y+ " paczek 1kg");




        return false; //true - sprzedaz zrealizowana
    }





    public Rice(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Ryżu w magazynie: {" +
                "m=" + m +
                ", n=" + n +
                '}';
    }
}
