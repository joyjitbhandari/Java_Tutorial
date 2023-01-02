package SingleTone_Object;
class Sample {
    static int count = 0;
    int a =10;
    static Sample s1;
    private Sample(){
        count++;
    }

    public static Sample getInstance() {
        if (count<1){
            s1 = new Sample();
        }
        return s1;
    }

    public static void setInstance(int x) {
        s1.a = x;
    }
}


