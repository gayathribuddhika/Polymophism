
package polymophism;


public class Polymophism {

    
    public static void main(String[] args) {
        Bank boc = new Bank_BOC();
        Bank nsb = new Bank_NSB();
        Bank hnb = new Bank_HNB();
        System.out.println(boc.getInterestRate());
        System.out.println(nsb.getInterestRate());
        System.out.println(hnb.getInterestRate());
    }
    
}
