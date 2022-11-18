/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablahash;

        
/**
 *
 * @author ernst
 */
public class TablaHash {
    private final Integer size = 13;
    
    
    public TablaHash() {
        
        private Integer hash(Integer A){
            Integer key = 0;
            key =(A & 0x7fffffff)% size;
            return key;
            
        }
        public Integer buscar(Integer A){
            return null;
        }
        public void insertar(Integer A) {
            System.out.println("has -->"+hash(A));
            
        }
        public void borra(Integer A){
            
        }

    @Override
    public String toString() {
        return "TablaHash{" + "size=" + size + '}';
    }
        

  
    public static void main(String[] args) {
        // TODO code application logic here
        TablaHash tristeza = new TablaHash();
        for (Integer i = 30; i<= 30;++);
        tristeza.insertar(i);
        }
    
    }
    
}
        