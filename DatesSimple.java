
public class DatesSimple {
    public static void main (String[] args) {
        int fromy = 2000, fromm = 2, fromd = 3;
        int toy = 2127, tom = 11, tod =29;

System.out.println("**** Original\n" + 
    "From " + fromy + "/" +
    fromm + "/" + fromd + " to " +
    toy + "/" + tom + "/" + tod);

int period = 0;

int fromyRel = fromy - 2000;
int toyRel = toy - 2000;

period = (fromyRel << 25) |
        (fromm << 21) |
        (fromd << 16) |
        (toyRel << 9) |
        (tom << 5) |
        (tod);

fromy = fromm = fromd = toy = tom = tod = 0;

fromyRel = (period >> 25) & 0x7F;
fromm = (period >> 21) & 0x0F;
fromd = (period >> 16) & 0x1F;
toyRel = (period >> 9) & 0x7F;
tom = (period >> 5) & 0x0F;
tod = period & 0x1F;

fromy = fromyRel + 2000;
toy = toyRel + 2000;

System.out.println("**** Reconstructed\n" + 
    "From " + fromy + "/" +
    fromm + "/" + fromd + " to " +
    toy + "/" + tom + "/" + tod);

    }
    
}
