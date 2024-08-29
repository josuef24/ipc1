
package ipc1_proyecto1_202300668;

import java.util.ArrayList;

import ipc1_proyecto1_202300668.interfaz.Login;
import ipc1_proyecto1_202300668.clases.investigador;

public class IPC1_Proyecto1_202300668 {

    public static ArrayList<investigador> listaInvestigadores = new ArrayList<>();
    
    
    public static void main(String[] args) {
        Login vtn_login = new Login();
        vtn_login.setVisible(true);
    }
    
    public static void agregarInvestigador(investigador new_investigador){
       listaInvestigadores.add(new_investigador);
        
    }
    
    public static Object[][] mostrarInvestigadores(){
        int filas = listaInvestigadores.size();
        Object[][] matrizObjetos = new Object[filas][4] ;
        
        for (int i = 0; i < filas; i++) {
            investigador temp_investigador = listaInvestigadores.get(i);
            
            matrizObjetos[i][0]= temp_investigador.getCodigo();
            matrizObjetos[i][1]= temp_investigador.getNombre();
            matrizObjetos[i][2]= temp_investigador.getGenero();
            matrizObjetos[i][3]= temp_investigador.getContraseña();
            
            

        }
        return matrizObjetos;
    }
           
}
