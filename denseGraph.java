import java.util.*;
/* Input
4
0 11 6 4
11 0 7 3
6 7 0 2
4 3 2 0
 */
public class denseGraph{
    static Scanner scn=new Scanner(System.in);
    static void findDist(int [][]graph){
        int [][] res= new int[graph.length][graph[0].length];
        for(int n=0;n<graph.length;n++){
            System.out.println("For k="+n+" matrix is");
            for(int i=0;i<graph.length;i++){
                for(int j=0;j<graph[0].length;j++){
                    graph[i][j]=Math.min(graph[i][j],graph[i][n]+graph[n][j]);
                    System.out.print(graph[i][j]+" ");
                }
                System.out.println();
            }
        }
        System.out.println("Final Matrix is: ");
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        System.out.println("Enter the no of vertices ");
        int n=scn.nextInt();
        int [][] graph=new int[n][n];
        System.out.println("Enter Adjacency Graph ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=scn.nextInt();
            }
        }
        findDist(graph);
    }
}