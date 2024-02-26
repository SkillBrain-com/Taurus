package kateaManoila.Java3.Exzercses.TemaDeAcasa3;

public class TestBirdWatcher {
    public static void main(String[] args) {
        int [] birds ={0, 2, 5, 3, 7, 8, 4};
        BirdWatcher bw = new BirdWatcher(birds);
        System.out.println(bw.getToday());
        System.out.println(  bw.getBusyDays());
        System.out.println( bw.getCountForFirstDays(3));
        System.out.println( bw.incrementToday());
        bw.getLastWeek();
    }
}
