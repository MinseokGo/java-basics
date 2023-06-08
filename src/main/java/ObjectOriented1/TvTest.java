package ObjectOriented1;

class TvTest {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();

        System.out.println(t.channel);
    }
}