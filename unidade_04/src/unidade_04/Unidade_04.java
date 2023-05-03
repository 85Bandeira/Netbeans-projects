/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade_04;

/**
 *
 * @author Miguel
 */
public class Unidade_04 {

    /**
     * @param args the command line arguments
     */
    public static void bubbleSort(int[] array) {
      for(int i=0; i<array.length; i++) {
          for(int j=1; j< (array.length-i); j++){
              if(array[j-1] > array[j]){
                  int aux = array[j-1];
                  array[j-1] = array[j];
                  array[j] = aux;
                          
              }
          }
      }  
      
        
    }
private static void imrimir(int vetor[])
{
    for(int aux: vetor)
    {
        System.out.println(aux);
    }    
}
        public static void main(String[] args) {
            int array[] = new int[]{200,0,-201,-33};
            bubbleSort(array);
            imprimir(array);
        }
}
