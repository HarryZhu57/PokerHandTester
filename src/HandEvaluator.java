import java.util.ArrayList;

public class HandEvaluator {

    public ArrayList<Card> getFive() {
    	
    	
    	Deck d = new Deck();
    	ArrayList<Card> h = new ArrayList<Card>();
    	
    	
        d.construct();
        d.shuffle();

        for(int i=0;i<5;i++) {
            h.add(d.drawCard());
        }
        
        return h;
    }
    
    public double findPair(int times) {
    	
    	double p = 0;

    	for(int i = 0; i < times; i++) {
        	ArrayList<Card> h = getFive();
            
    		out:
    		for(int j = 0;j < h.size()-1;j++) {
    			for(int k = j + 1;k < h.size();k++) {
    				if(h.get(j).getCardNum() == h.get(k).getCardNum()) {
    					p++;
    		    		break out;
    				}
    			}
    		}
    	}

    	p = (p/times)*100;
    	
    	return p;
    }
    
    public double findThree(int times) {
    	
    	double p = 0;

    	for(int i = 0; i < times; i++) {
        	ArrayList<Card> h = getFive();
        	
    		out:
    		for(int j = 0;j < h.size()-1;j++) {
    			for(int k = j + 1;k < h.size();k++) {
    				for(int n = k + 1;n < h.size();n++) {
    					if(h.get(j).getCardNum() == h.get(k).getCardNum() && h.get(j).getCardNum() == h.get(k).getCardNum()) {
    						p++;
    						break out;
    					}
    				}
    			}
    		}
    	}

    	p = (p/times)*100;
    	
    	return p;
    }

    public double findDoublePair(int times) {
    	
    	double p = 0;
    	int checked = 0;

    	for(int i = 0; i < times; i++) {
        	ArrayList<Card> h = getFive();
            
    		out:
    		for(int j = 0;j < h.size()-1;j++) {
    			for(int k = j + 1;k < h.size();k++) {
    				if(h.get(j).getCardNum() == h.get(k).getCardNum()) {
    					checked = h.get(k).getCardNum();
    		    		break out;
    				}
    			}
    		}
    		
    		out2:
        		for(int j = 0;j < h.size()-1;j++) {
        			for(int k = j + 1;k < h.size();k++) {
        				if(h.get(j).getCardNum() == h.get(k).getCardNum() && h.get(j).getCardNum() != checked) {
        					p++;
        		    		break out2;
        				}
        			}
        		}
    	}

    	p = (p/times)*100;
    	
    	return p;
    }

    public double findStraight(int times) {
    	double p = 0;

    	for(int i = 0; i < times; i++) {
        	ArrayList<Card> h = getFive();
        	
        	out:
        	for(int j = 0;j < h.size();j++) {
        		for(int k = 0;k < h.size();k++) {
        			for(int l = 0;l < h.size();l++) {
        	        	for(int m = 0;m < h.size();m++) {
        	        		for(int z = 0;z < h.size();z++) {
            	        		if(h.get(j).getCardNum() + 1 == h.get(k).getCardNum() && h.get(j).getCardNum() + 2 == h.get(l).getCardNum() &&  h.get(j).getCardNum() + 3 == h.get(m).getCardNum() &&  h.get(j).getCardNum() + 4 == h.get(z).getCardNum()) {
            	        			p++;
            	        		    break out;
            	        		}
            	        	}
        	        	}
        	        }
        		}
        	}
    	}

    	p = (p/times)*100;
    	
    	return p;
    }
    
    public double findFH(int times) {
    	boolean pair = false;
    	int checked = 0;
    	double p = 0;

    	for(int i = 0; i < times; i++) {
        	ArrayList<Card> h = getFive();
            
    		out:
    		for(int j = 0;j < h.size()-1;j++) {
    			for(int k = j + 1;k < h.size();k++) {
    				if(h.get(j).getCardNum() == h.get(k).getCardNum()) {
    					pair = true;
    					checked = h.get(j).getCardNum();
    		    		break out;
    				}
    			}
    		}
    		
    		out1:
        		for(int j = 0;j < h.size()-1;j++) {
        			for(int k = j + 1;k < h.size();k++) {
        				for(int n = k + 1;n < h.size();n++) {
        					if(h.get(k).getCardNum() == h.get(j).getCardNum() && h.get(k).getCardNum() == h.get(n).getCardNum() && pair == true && h.get(k).getCardNum() != checked) {
        						p++;
        						pair = false;
        						break out1;
        					}
        				}
        			}
        		}
    	}


    	p = (p/times)*100;
    	
    	return p;
    }
    
    public double findFlush(int times) {
    	double p = 0;

    	for(int i = 0; i < times; i++) {
        	ArrayList<Card> h = getFive();
            
        	if(h.get(0).getCardSuite() == h.get(1).getCardSuite() && h.get(0).getCardSuite() == h.get(2).getCardSuite() && h.get(0).getCardSuite() == h.get(3).getCardSuite() && h.get(0).getCardSuite() == h.get(4).getCardSuite()) {
        		p++;
        	}
    	}

    	p = (p/times)*100;
    	
    	return p;
    }
    
    public double findFour(int times) {
    	double p = 0;

    	for(int i = 0; i < times; i++) {
        	ArrayList<Card> h = getFive();
            
    		out:
    		for(int j = 0;j < h.size()-1;j++) {
    			for(int k = j + 1;k < h.size();k++) {
    				for(int l = k + 1;l < h.size()-1;l++) {
    	        		for(int m = l + 1;m < h.size();m++) {
    	        			if(h.get(j).getCardNum() == h.get(k).getCardNum() && h.get(j).getCardNum() == h.get(l).getCardNum() &&  h.get(j).getCardNum() == h.get(m).getCardNum() ) {
    	        				p++;
    	        		    	break out;
    	        			}
    	        		}
    	        	}
    			}
    		}
    	}
    	p = (p/times)*100;
    	
    	return p;
    }
    
    public void printHand(ArrayList<Card> h) {
        for(int i=0;i<h.size();i++) {
        	if(h.get(i).getCardNum() < 11) {
        		System.out.println(h.get(i).getCardNum() + " of " + h.get(i).getCardSuite());
        	}
        	else if(h.get(i).getCardNum() == 11) {
        		System.out.println("Jack of " + h.get(i).getCardSuite());
        	}
        	else if(h.get(i).getCardNum() == 12) {
        		System.out.println("Queen of " + h.get(i).getCardSuite());
        	}
        	else if(h.get(i).getCardNum() == 13) {
        		System.out.println("King of " + h.get(i).getCardSuite());
        	}
        	else
        		System.out.println("IDK must be a joker or sumtn");
        }
    }
}