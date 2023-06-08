package ObjectOriented1;

class TvTest2 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();

        Tv t2 = new Tv();
        t2.channel = 5;

        System.out.println(t.channel + "," + t2.channel);
    }
}