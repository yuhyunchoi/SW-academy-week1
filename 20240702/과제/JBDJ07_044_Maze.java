public class JBDJ07_044_Maze{

    public static void main(String[] args){

        int[][] mazeShape = {{0,0,1,1,1,1,1,1,1,1},
                            {1,0,0,1,1,1,1,1,1,1},
                            {1,1,0,0,0,1,1,1,1,1},
                            {1,1,1,1,0,0,1,1,1,1},
                            {1,1,1,1,1,0,1,1,1,1},
                            {1,1,1,1,1,0,1,1,1,1},
                            {1,1,1,1,1,0,0,1,1,1},
                            {1,1,1,1,1,1,0,0,0,1},
                            {1,1,1,1,1,1,1,1,0,1},
                            {1,1,1,1,1,1,1,1,0,0}
                           };

        int[][] visited = new int[10][10];

        int posRow = 0;
        int posCol = 0;
        
        int countMove = 0;
        
            try {
                for(int i = 0 ; i < 100 ; i++){ 
    
                    visited[posRow][posCol] = 2; //이미 지나간 경로를 2로 설정
            
                    if( posRow < 9 && mazeShape[posRow+1][posCol] == 0 && visited[posRow+1][posCol] != 2){ //오른쪽으로 이동
                        posRow++;
                        countMove++;
                    }
                    else if( posCol < 9 && mazeShape[posRow][posCol+1] == 0 && visited[posRow][posCol+1] != 2){ //아래로 이동
                    posCol++;
                        countMove++;
                    } 
                    else if( posRow - 1 >= 0 && mazeShape[posRow-1][posCol] == 0 && visited[posRow-1][posCol] != 2) { //위로 이동
                        posRow--;
                        countMove++;
                    }
                    else if( posCol - 1 >= 0 && mazeShape[posRow][posCol-1] == 0 && visited[posRow][posCol-1] != 2){ //왼쪽 이동
                        posCol--;
                        countMove++;
                    }
                    else{
                        break;
                    }
                }
                if(posRow == 9 && posCol == 9){
                    System.out.println("Success, " + countMove);
                }
                else{
                    System.out.println("Fail, " + countMove);
                }
            } 

            catch(Exception e){
                e.printStackTrace();
            } 
        
        }


}
 