import java.io.Serializable;
public class Tabla_sec implements Serializable{
    int tab[][] = new int[4][8];
    int ritmo;
    int repeat;
    Boolean ciclo_inf;
    public Tabla_sec(){
        inicia();
        ritmo = 1;
        repeat = 1;
        ciclo_inf = false;
    }
    
    public void inicia(){
        for (int i =0;i<4;i++){
            for(int j =0;j<8;j++){
                tab[i][j]=0;
            }
        }
    }
    
    public void presionado(int x,int y){
        tab[x][y]=1;
    } 
    
    public void n_pres(int x, int y){
        tab[x][y]=0;
    }
    
    public void imp(){
        System.out.println("\n");
        for (int i =0;i<4;i++){
            for(int j =0;j<8;j++){
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    
}
