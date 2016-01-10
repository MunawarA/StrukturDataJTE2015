import java.math.BigInteger;
import java.util.Stack;

/**
 * Write a description of class Tumpukan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tumpukan
{
    private Node atas;
    private Node bawah;
    Stack stack = new Stack<BigInteger>();
    
    public Tumpukan(){
        atas = null;
    }
            
    public void tumpuk(BigInteger data){
        Node nodeBaru = new Node(data);
        
        if(atas == null){
            atas = nodeBaru;
            stack.push(data);
        }
        else{
            Node sekarang = atas;
            
            while(sekarang.berikut != null)
            stack.push(data);
                sekarang = sekarang.berikut;
            sekarang.berikut = nodeBaru;
        }
    }
    
    public BigInteger ambil(){
        if(atas != null){
            stack.pop();
        }
        else{
            atas = bawah = null;
        }
        return null;
    }
   
    public BigInteger atas(){
        return null;
    }
    
    public BigInteger bawah(){
        return null;
    }
}
