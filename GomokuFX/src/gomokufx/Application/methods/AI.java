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
public class AI {
    int[][] board = new int[25][25];
    boolean level = true; //True: max level; False: min level.
    
    //get the score of the current chess piece
    private int getScore(int x, int y, char token){
        return evaluate(x,y,token)+evaluate(x,y,(char)(153 - token));
    }
    
    //evaluate the current score according to the moves
    private int evaluate(int x, int y, char token){
        int value = 0;
        
        //1: my token; 0: empty move; 2: opponent's token; *:current move
        for(int i=1; i<=8; i++){
                  
            //case: 01111*
            if(checkLine(x,y,i,-1)==token &&
               checkLine(x,y,i,-2)==token &&
               checkLine(x,y,i,-3)==token &&
               checkLine(x,y,i,-4)==token &&
               checkLine(x,y,i,-5)==' '){
                    
            }
            //case: 21111*
            if(checkLine(x,y,i,-1)==token &&
               checkLine(x,y,i,-2)==token &&
               checkLine(x,y,i,-3)==token &&
               checkLine(x,y,i,-4)==token &&
               (checkLine(x,y,i,-5)==(char)(153-token)||checkLine(x,y,i,5)=='E')){
                
            }
            
            //case: 111*1
            if(checkLine(x,y,i,-1)==token &&
               checkLine(x,y,i,-2)==token &&
               checkLine(x,y,i,-3)==token &&
               checkLine(x,y,i,1)==token){
                
            }
            
            //case: 11*11
            if(checkLine(x,y,i,-1)==token &&
               checkLine(x,y,i,-2)==token &&
               checkLine(x,y,i,1)==token &&
               checkLine(x,y,i,2)==token){
                
            }
               
            //case: 111*
            if(checkLine(x,y,i,-1)==token &&
               checkLine(x,y,i,-2)==token &&
               checkLine(x,y,i,-3)==token){
                //available moves on the two sides
                //0111*0
               if(checkLine(x,y,i,1)==' ' && checkLine(x,y,i,-4)==' '){
                
                }
               
               //1110*

               //no available moves on the two sides
               //|*1112, 2111*2, 2111*|
             
               else if((checkLine(x,y,i,-4)==(char)(153-token) || checkLine(x,y,i,-4)=='E')&&
                       checkLine(x,y,i,1)==(char)(153-token) || checkLine(x,y,i,1)=='E'){
                
               //available moves only on the one side
               // |111*00
               // 2111*00    
               }
               else{
                   
               }
            }

            //case: 101*1
            if(checkLine(x,y,i,-1)==token && 
               checkLine(x,y,i,1)==token &&
               checkLine(x,y,i,-3)==token){
                
            }
        
            //case: 1*1
            if(checkLine(x,y,i,1)==token &&
               checkLine(x,y,i,-1)==token){
                //no dead moves
                // 01*10
                if(checkLine(x,y,i,2)==token &&
               checkLine(x,y,i,-2)==token){
                    
                
                }
                //dead moves on two sides
                else if((checkLine(x,y,i,2)==(char)(153-token) || checkLine(x,y,i,2)=='E') &&
                         checkLine(x,y,i,-2)==(char)(153-token) || checkLine(x,y,i,-2)=='E'){
                    
                }
                //dead move one side 
                // |1*10, 01*1|, 21*10, 21*12, |1*1|
                else{
                    
                }
            }
            
            //case: 11*
            if(checkLine(x,y,i,1)==token && checkLine(x,y,i,2)==token){
                // 011*0 
                if(checkLine(x,y,i,3)==' ' && checkLine(x,y,i,-1)==' '){
                    
                }
                //two dead moves
                //case: 11*|, 11*2, |11*|, 211*2
                else if((checkLine(x,y,i,3)==(char)(153 - token) || checkLine(x,y,i,-1)=='E') &&
                         checkLine(x,y,i,-1)==(char)(153 - token) || checkLine(x,y,i,-1)=='E'){
                    
                }
                //dead moves on one side
                //011*2, 211*0
                else{
                    
                }
            }
            
            //case: 0*0, no dead move
            if(checkLine(x,y,i,1)==' ' && checkLine(x,y,i,-1)==' '){
                
            }
            
            //case: dead moves on two side
            //|*2, 2*0 
            if((checkLine(x,y,i,1)==(char)(153-token) || checkLine(x,y,i,1)==(char)(153-token)) &&
                checkLine(x,y,i,-1)==(char)(153-token) || checkLine(x,y,i,-1)==(char)(153-token)){
                
            }
            
            //case: dead move on one side
            if(((checkLine(x,y,i,1)==(char)(153-token) || checkLine(x,y,i,1)==(char)(153-token)) && checkLine(x,y,i,-1)==' ') ||
                (checkLine(x,y,i,-1)==(char)(153-token) || checkLine(x,y,i,-1)==(char)(153-token)) && checkLine(x,y,i,-1)==' '){
                
            }
        }
        
        //assign the value to the move according to its location
        if((x==0 || x==24) && y!=0 && y!=24)value+=1;
        else if(y==0 || y==24)value+=1;
        if((x==1 || x==23) && y!=1 && y!=23)value+=2;
        else if(y==1 || y==23)value+=2;
        if((x==2 || x==22) && y!=2 && y!=22)value+=3;
        else if(y==2 || y==22)value+=3;
        if((x==3 || x==21) && y!=3 && y!=21)value+=4;
        else if(y==3 && y==21)value+=4;
        if((x==4 || x==20) && y!=4 && y!=20)value+=5;
        else if(y==4 && y==20)value+=5;
        if((x==5 || x==19) && y!=5 && y!=19)value+=6;
        else if(y==5 && y==19)value+=6;
        if((x==6 || x==18) && y!=6 && y!=18)value+=7;
        else if(y==6 && y==18)value+=7;
        if((x==7 || x==17) && y!=7 && y!=17)value+=8;
        else if(y==7 || y==17)value+=8;
        if((x==8 || x==16) && y!=8 && y!=16)value+=9;
        else if(y==8 || y==16)value+=9;
        if((x==9 || x==15) && y!=9 && y!=15)value+=10;
        else if(y==9 || y==15)value+=10;
        if((x==10 || x==14) && y!=10 && y!=14)value+=11;
        else if(y==10 || y==14)value+=11;
        if((x==11 || x==13) && y!=11 && y!=13)value+=12;
        else if(y==11 || y==13)value+=13;
        else  value+=14;
               
        return value;
    }
    
    private int Alpha_Beta(int depth, int alpha, int beta, int x, int y, char token){
        if(depth==5){
            board[x][y] = evaluate(x,y,token);
            return board[x][y];
        }
        //at the max level
        if(this.level){
            int value = Integer.MIN_VALUE;
            for(int i=0; i<25; i++){
                for(int j=0; j<25; j++){
                    //no chess piece here
                    if(Board[i][j].getToken()==' ')continue;
                    Board[i][j].setToken(token,i,j);
                    this.level = false;
                    token = (token =='B')? 'W':'B';
                    value = Math.max(value, -Alpha_Beta(depth+1,-beta, -alpha, i, j, token));
                    if(value )
                }
            }
        }
        
    }
    
    private char checkLine(int x, int y, int i, int j){ //i: direction, j: move j steps
        switch(i){
            case 1:
                x = x+j;
                break;
            case 2:
                x = x-j;
                break;
            case 3:
                y = y+j;
                break;
            case 4:
                y = y-j;
                break;
            case 5:
                x = x+j;
                y = y+j;
                break;
            case 6:
                x = x-j;
                y = y+j;
                break;
            case 7:
                x = x+j;
                y = y-j;
                break;
            case 8:
                x = x-j;
                y = y-j;            
        }
        
        if(x<0 || y < 0 || x>13 || y>13){
            return 'E';
        }
        //return the token of the next move on the chessboard
        return Board[x][y].getToken();
    }
}
