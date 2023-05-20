
package Intefaz;




public class Botones {
    private static JfRegistros panel;
    private static  Usuarios  personas [];
    private static int contador;
    
   // @param args the command line arguments
    
    public static void main(String[]args){
    panel=new JfRegistros();
    personas = new Usuarios [20];
    
    for (int i=0;i<20;i++){
        personas [i]=new Usuarios();
        
        }
        contador=0;
        
        panel.setVisible(true);
    }
    
    public static void guardar(String n,String a,int e,String s,String b,String p,String l){
       personas[contador].setNombre(n);
       personas[contador].setApellidos(a);
       personas[contador].setEdad(e);
       personas[contador].setSignoZodiacal(s);
       personas[contador].setBias(b);
       personas[contador].setPrimeraCancion(p);
       personas[contador].setAlias(l);
       
       contador++;
       
    }
    
    public static void buscar (String bus){
        for (int j=0;j<personas.length;j++){
            if (personas[j].getNombre().equals(bus)){
              panel.cargaDatos(personas[j]);
            }
            
        }
    }
}
