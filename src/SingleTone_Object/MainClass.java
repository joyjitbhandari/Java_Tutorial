package SingleTone_Object;

class MainClass {
    public static void main(String[] args) {
        Sample s1 = Sample.getInstance();
        System.out.println(s1.a);
        Sample s2 = Sample.getInstance();
        System.out.println(s2.a);
        Sample.setInstance(50);
        Sample s3 = Sample.getInstance();
        System.out.println(s3.a);
    }
}
