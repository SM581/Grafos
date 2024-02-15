/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 59399
 */
public class Grafos {
 //int v;
 //List<Integer>[] adj;
 
 // Constructor que recibe el número de vértices y crea la lista de adyacencia
//Grafos (int v){
  //   this.v = v;
    // adj = new ArrayList[v];
     //for (int i = 0; i < v; i++){
       //  adj[i] = new ArrayList <>();
     //}
// }
// Método para agregar una arista al grafo 
//public void agregarArista (int u, int v){
//    adj[v].add(v); // agregar v a la lista de u
//    adj[v].add(u); // agregar u a la lista de v 
            
//}
 
//public void dfs (int s){
    // Crear un vector de booleanos para marcar los vértices visitados
  //  boolean [] visitado = new boolean [v];
    // Llamar al método auxiliar dfsUtil para recorrer el grafo recursivamente
   // dfsUtil (s, visitado);
//}

 // Método auxiliar para recorrer el grafo usando DFS
//public void dfsUtil (int s, boolean [] visitado){
    // Marcar el vértice actual como visitado y mostrarlo
   // visitado[s] = true;
   // System.out.println(s + "");
    // Recorrer la lista de adyacencia del vértice actual y 
    //llamar a dfsUtil para sus vecinos no visitados
    //for (int v : adj [s]){
      //  if (!visitado[v]){
        //    dfsUtil (v, visitado);
        //}
    //}
//}

    
    private int numVertices;
    private LinkedList<Integer> listaAdyacencia[];
    
    public Grafos(int numVertices) {
        this.numVertices = numVertices;
        listaAdyacencia = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            listaAdyacencia[i] = new LinkedList<>();
        }
    }
    
    public void agregarArista(int origen, int destino) {
        listaAdyacencia[origen].add(destino);
    }
    
    public void dfs(int verticeInicial) {
        boolean[] visitado = new boolean[numVertices];
        dfsRecursivo(verticeInicial, visitado);
    }
    
    private void dfsRecursivo(int vertice, boolean[] visitado) {
        visitado[vertice] = true;
        System.out.print(vertice + " ");
        
        Iterator<Integer> it = listaAdyacencia[vertice].listIterator();
        while (it.hasNext()) {
            int siguienteVertice = it.next();
            if (!visitado[siguienteVertice]) {
                dfsRecursivo(siguienteVertice, visitado);
            }
        }
    }
}

    

