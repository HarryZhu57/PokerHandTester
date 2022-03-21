public class PokerTester {
    public static void main(String[] args) {
    	int times = 10000;
    	
        HandEvaluator he = new HandEvaluator();
        
        System.out.println("Chances of a pair in a poker hand: " + he.findPair(times));
        System.out.println("Chances of a three of a kind in a poker hand: " + he.findThree(times));
        System.out.println("Chances of a double pair in a poker hand: " + he.findDoublePair(times));
        System.out.println("Chances of a straight in a poker hand: " + he.findStraight(times));
        System.out.println("Chances of a full house in a poker hand: " + he.findFH(times));
        System.out.println("Chances of a flush in a poker hand: " + he.findFlush(times));
        System.out.println("Chances of a four of a kind in a poker hand: " + he.findFour(times));
    }
}