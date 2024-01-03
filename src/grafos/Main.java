/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

/**
 *
 * @author 59399
 */
public class Main {
    public static void main(String[] args) {
        // Crear un grafo usando la clase Grafo
        Grafos g = new Grafos (4);
        g.agregarArista (0,1);
        g.agregarArista (0,2);
        g.agregarArista (1,2);
        g.agregarArista (2,0);
        g.agregarArista (2,3);
        g.agregarArista (3,3);
        System.out.println("El recorrido DFS delgrafo a partir del vértice 0 es: ");
        g.dfs(0);
        
    }
}
