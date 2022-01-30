/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokufx.Application.methods;

/**
 *
 * @author rickyzheng
 */

//checking the win condition
public class Win {
    private int[][] chess;
    
    public Win(int[][] chess){
        this.chess = chess;
    }
    
    public void isWin(int x, int y){
        if(checkRow(x,y)==5 || checkCol(x,y)==5 ||checkLeft(x,y)==5 || checkRight(x,y)==5){
            //declare the winning side in the window
            if(chess[x][y]==1){
                //black wins
            }
            if(chess[x][y]==-1){
                //white wins
            }
        }
    }
        
    public int checkRow(int x, int y){
        int n=0;
            
        for(int i=x+1; i<chess.length;i++){
            if(chess[x][i]==chess[x][y])n++;
            else break;
            if(n==5)return n;
        }
        
        for(int i=x;i>=0;i--){
            if(chess[x][i]==chess[x][y])n++;
            else break;
            if(n==5)return n;
        }
        return n;
    }
    
    public int checkCol(int x, int y){
        int n=0; 
        
        for(int i = x+1;i<chess.length;i++){
            if(chess[i][y] == chess[x][y])n++;
            else break;
            if(n==5)return n;
        }

	for(int i = x;i>=0;i--){
            if(chess[i][y] == chess[x][y])n++;
            else break;
            if(n==5)return n;

	}		
	return n;
    }
    
    //check the left diagonal
    public int checkLeft(int x, int y){
        int n=0;
        for(int i=x+1, j=y+1; i<chess.length && j<chess.length;i++,j++){
            if(chess[i][j]==chess[x][y])n++;
            else break;
            if(n==5)return n;
        }
        for(int i=x,j=y;i>=0 && j>=0; i--, j--){
            if(chess[i][j]==chess[x][y])n++;
            else break;
            if(n==5)return n;
        }
        return n;
    }
    
    public int checkRight(int x, int y){
        int n=0;
        for(int i=x+1, j=y+1; i<chess.length && j<chess.length; i++,j--){
            if(chess[i][j]==chess[x][y])n++;
            else break;
            if(n==5)return n;
        }
        for(int i=x, j=y; i>=0 && j>=0; i--,j++){
            if(chess[i][j]==chess[x][y])n++;
            else break;
            if(n==5)return n;
        }
        return n;
    }
}
